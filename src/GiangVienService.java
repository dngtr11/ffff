
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dungt
 */
public class GiangVienService {

    private List<GiangVien> list = new ArrayList<>();

    public GiangVienService() {
        list.add(new GiangVien("ma", "dung", 2004, true, "fullTime"));
        list.add(new GiangVien("ma1", "thuong", 2001, true, "fullTime"));
        list.add(new GiangVien("ma2", "huong", 2002, false, "partTime"));
        list.add(new GiangVien("ma3", "anh", 2003, true, "fullTime"));
        list.add(new GiangVien("ma4", "dang", 2005, false, "partTime"));
    }

    public List<GiangVien> getAll() {
        return list;
    }

    public List<GiangVien> getList() {
        return list;
    }

    public void setList(List<GiangVien> list) {
        this.list = list;
    }

    public String remove(int viTri) {
        if (viTri == - 1) {
            return "chưa chọn dòng xóa";
        }
        list.remove(viTri);
        return "xóa thành công";
    }

    public void sapXep() {
        list.sort((o1, o2) -> {
            return o1.getTenGV().compareTo(o2.getTenGV());
        });

    }

    public void add(GiangVien giangVien) {
        list.add(giangVien);
    }

    public void update(int viTri, GiangVien giangVien) {
        list.set(viTri, giangVien);
    }

    public List<GiangVien> top5(List<GiangVien> list) {
        List<GiangVien> top = new ArrayList<>();
        list.sort((o1, o2) -> {
            return o2.getNamSinh() - o1.getNamSinh();
        });
        top = list.subList(0, 5);
        return top;
    }

}
