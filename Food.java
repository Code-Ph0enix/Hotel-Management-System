package ia2;

public class Food{
    public int itemno;
    public int quantity;
    public float price;
    
    public Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        
        switch(itemno)
        {
            case 1:price=quantity*50;
            break;
            case 2:price=quantity*60;
            break;
            case 3:price=quantity*70;
            break;
            case 4:price=quantity*30;
            break;
        }
    }
}
    

