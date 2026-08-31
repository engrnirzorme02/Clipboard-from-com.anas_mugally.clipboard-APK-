package p019C1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 C1.b, still in use, count: 1, list:
  (r0v0 C1.b) from 0x001a: SPUT (r0v0 C1.b) C1.b.c C1.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: C1.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0126b {
    PREFER_ARGB_8888,
    PREFER_RGB_565;


    /* JADX INFO: renamed from: c */
    public static final EnumC0126b f682c = new EnumC0126b();

    static {
    }

    private EnumC0126b() {
        super(str, i);
    }

    public static EnumC0126b valueOf(String str) {
        return (EnumC0126b) Enum.valueOf(EnumC0126b.class, str);
    }

    public static EnumC0126b[] values() {
        return (EnumC0126b[]) f683d.clone();
    }
}
