public class WrapperBoolean {

	public static void main(String[] args) {
		System.out.println("Boolean.TRUE : " + Boolean.TRUE);
		System.out.println("Boolean.FALSE : " + Boolean.FALSE);
		Boolean wrapperBoolean = new Boolean(true);
		System.out.println("wrapperBoolean.booleanValue() : "
					+ wrapperBoolean.booleanValue());
	}

}
