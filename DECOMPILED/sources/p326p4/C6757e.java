package p326p4;

import java.util.Stack;

/* JADX INFO: renamed from: p4.e */
/* JADX INFO: loaded from: classes.dex */
public class C6757e {

    /* JADX INFO: renamed from: a */
    public final String f27135a;

    /* JADX INFO: renamed from: b */
    public final String f27136b;

    /* JADX INFO: renamed from: c */
    public final StackTraceElement[] f27137c;

    /* JADX INFO: renamed from: d */
    public final C6757e f27138d;

    private C6757e(String str, String str2, StackTraceElement[] stackTraceElementArr, C6757e c6757e) {
        this.f27135a = str;
        this.f27136b = str2;
        this.f27137c = stackTraceElementArr;
        this.f27138d = c6757e;
    }

    /* JADX INFO: renamed from: a */
    public static C6757e m29543a(Throwable th, InterfaceC6756d interfaceC6756d) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        C6757e c6757e = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c6757e = new C6757e(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC6756d.mo29540a(th2.getStackTrace()), c6757e);
        }
        return c6757e;
    }
}
