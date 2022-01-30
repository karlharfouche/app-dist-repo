import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/manipcours";
        String userName = "root";
        String password = "";
        String query = "select * from catalogue;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection cx = DriverManager.getConnection(url,userName,password);
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String nomP = rs.getString("NomP");
            int poid = rs.getInt("Poids");
            String couleur = rs.getString("Couleur");
            String prix = rs.getString("Prix");
            System.out.println("Nom du produit: " + nomP + ", poids: " + poid + ", couleur: " + couleur + ", et prix: " + prix + ".");
        }
        rs.close();
        st.close();
        cx.close();

    }
}
