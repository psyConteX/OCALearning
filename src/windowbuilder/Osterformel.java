package windowbuilder;

public class Osterformel {
	public int y,g,c,h,i,j,l,m,d;
	
	Osterformel(int y) {
		this.y=y;
		g=this.y%19;
		c=y/100;
		h=(c-(c/4)-((8*c+13)/25)+(19*g)+15)%30;
		i=h-(h/28)*(1-(29/(h+1))*((21-g)/11));
		j=(this.y+(this.y/4)+i+2-c+(c/4))%7;
		l=i-j;
		m=3+((l+40)/44);
		d=l+28-(31*(m/4));
	}
	
}
