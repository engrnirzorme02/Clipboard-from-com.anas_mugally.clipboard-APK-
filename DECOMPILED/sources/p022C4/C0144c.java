package p022C4;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: C4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0144c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0145d f702a;

    /* JADX INFO: renamed from: b */
    private final String f703b;

    /* JADX INFO: renamed from: c */
    private final String f704c;

    public C0144c(InterfaceC0145d interfaceC0145d, String str) {
        this(interfaceC0145d, str, null);
    }

    /* JADX INFO: renamed from: d */
    private static String m620d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: g */
    private long m621g() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    private String m622h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f704c == null) {
            return str;
        }
        return this.f704c + " - " + str;
    }

    /* JADX INFO: renamed from: a */
    public void m623a(String str, Throwable th, Object... objArr) {
        if (m627f()) {
            String strM622h = m622h(str, objArr);
            if (th != null) {
                strM622h = strM622h + "\n" + m620d(th);
            }
            this.f702a.mo617a(InterfaceC0145d.a.DEBUG, this.f703b, strM622h, m621g());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m624b(String str, Object... objArr) {
        m623a(str, null, objArr);
    }

    /* JADX INFO: renamed from: c */
    public void m625c(String str, Throwable th) {
        this.f702a.mo617a(InterfaceC0145d.a.ERROR, this.f703b, m622h(str, new Object[0]) + "\n" + m620d(th), m621g());
    }

    /* JADX INFO: renamed from: e */
    public void m626e(String str) {
        this.f702a.mo617a(InterfaceC0145d.a.INFO, this.f703b, m622h(str, new Object[0]), m621g());
    }

    /* JADX INFO: renamed from: f */
    public boolean m627f() {
        return this.f702a.mo618b().ordinal() <= InterfaceC0145d.a.DEBUG.ordinal();
    }

    /* JADX INFO: renamed from: i */
    public void m628i(String str) {
        m629j(str, null);
    }

    /* JADX INFO: renamed from: j */
    public void m629j(String str, Throwable th) {
        String strM622h = m622h(str, new Object[0]);
        if (th != null) {
            strM622h = strM622h + "\n" + m620d(th);
        }
        this.f702a.mo617a(InterfaceC0145d.a.WARN, this.f703b, strM622h, m621g());
    }

    public C0144c(InterfaceC0145d interfaceC0145d, String str, String str2) {
        this.f702a = interfaceC0145d;
        this.f703b = str;
        this.f704c = str2;
    }
}
