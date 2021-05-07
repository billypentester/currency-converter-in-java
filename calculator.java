
public class calculator 
{

    float a;
    int f;
    int t;
    float[] pk={1.00f,0.48f,0.042f,0.024f,0.054f};
    float[] in={0.11f,1.00f,0.088f,0.051f,0.11f};
    float[] ch={23.70f,11.39f,1.00f,0.58f,1.29f};
    float[] sa={40.90f,19.67f,1.73f,1.00f,2.22f};
    float[] tr={18.43f,8.86f,0.78f,0.45f,1.00f};
    
    float result;
            
    public calculator(float amount,int from,int to)
    {
        a=amount;
        f=from;
        t=to;
    }
    
    public float process()
    {
        switch(f)
        {
            case 1 :
                result=pk[t-1]*a;
            break;
            case 2 :
                result=in[t-1]*a;
            break;
            case 3 :
                result=ch[t-1]*a;
            break;
            case 4 :
                result=sa[t-1]*a;
            break;
            case 5 :
                result=tr[t-1]*a;
            break;
        }
        
        return result;
        
    }
    
    
}
