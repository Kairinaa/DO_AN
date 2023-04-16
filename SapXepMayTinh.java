import java.util.Comparator;
    public class SapXepMayTinh implements Comparator <MayTinh>
    {
        public int compare(MayTinh a1, MayTinh a2)
        {
            int sub = a1.getSoluong()- a2.getSoluong();
            if (sub < 0)
            {
                return -1;
            }
            else if (sub == 0)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }