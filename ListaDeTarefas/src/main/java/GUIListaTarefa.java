import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIListaTarefa extends JFrame {
    private JPanel painel = new JPanel();
    private ArrayList<String> tarefas = new ArrayList<>();
    private DefaultListModel<String> lista;
    private JList<String> tarefasLista;
    private JTextField tarefaTextField;

    public ListaDeTarefasGUI() {
        setTitle("======================LISTA DE TAREFAS=========================");
        this.setSize(600, 400);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);

        lista = new DefaultListModel<>();
        tarefasLista = new JList<>(lista);
        JScrollPane scrollPane = new JScrollPane(tarefasLista);

        JPanel buttonPanel = new JPanel();
        JButton adicionarButton = new JButton("1.Adicionar Tarefa");
        JButton removerButton = new JButton("2.Remover Tarefa");
        JButton listarButton = new JButton("3.Listar Tarefas");
        JButton gerarJSONButton = new JButton("4.Gerar JSON ");
        JButton gerarArrayButton = new JButton("5.Carregar ArrayList das tarefas");


        tarefaTextField = new JTextField(20);

        buttonPanel.add(tarefaTextField);
        buttonPanel.add(adicionarButton);
        buttonPanel.add(removerButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(gerarJSONButton);
        buttonPanel.add(gerarArrayButton);




        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novaTarefa = tarefaTextField.getText();
                if (!novaTarefa.isEmpty()) {
                    adicionarTarefa(novaTarefa);
                    tarefaTextField.setText("");
                }
            }
        });
        listarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (!tarefas.isEmpty()) {
                    StringBuilder tarefasStr = new StringBuilder("Tarefas:\n");
                    for (String tarefa : tarefas) {
                        tarefasStr.append("- ").append(tarefa).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, tarefasStr.toString(), "Lista de Tarefas", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Nenhuma tarefa cadastrada.", "Lista de Tarefas", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            }
        );
        gerarJsonItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    objectMapper.writeValue(new File("tarefas.json"), tarefas);
                    JOptionPane.showMessageDialog(frame, "JSON gerado com sucesso!", "Gerar JSON", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao gerar JSON: " + ex.getMessage(), "Gerar JSON", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gerarArrayListItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    tarefas = objectMapper.readValue(new File("tarefas.json"), ArrayList.class);
                    JOptionPane.showMessageDialog(frame, "ArrayList carregado com sucesso!", "Carregar JSON", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao carregar JSON: " + ex.getMessage(), "Carregar JSON", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = tarefasLista.getSelectedIndex();
                if (selectedIndex != -1) {
                    removerTarefa(selectedIndex);
                }
            }
        });
    }

    private void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        lista.addElement(tarefa);
    }

    private void removerTarefa(int indice) {
        tarefas.remove(indice);
        lista.remove(indice);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIListaTarefa app = new GUIListaTarefa();
            app.setVisible(true);
        });
    }




}