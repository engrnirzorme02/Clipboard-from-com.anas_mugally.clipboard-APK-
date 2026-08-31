package p035E1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;

/* JADX INFO: renamed from: E1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0296q extends Exception {

    /* JADX INFO: renamed from: r */
    private static final StackTraceElement[] f1235r = new StackTraceElement[0];

    /* JADX INFO: renamed from: a */
    private final List f1236a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0130f f1237b;

    /* JADX INFO: renamed from: c */
    private EnumC0125a f1238c;

    /* JADX INFO: renamed from: d */
    private Class f1239d;

    /* JADX INFO: renamed from: e */
    private String f1240e;

    /* JADX INFO: renamed from: f */
    private Exception f1241f;

    public C0296q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    private void m1442a(Throwable th, List list) {
        if (th instanceof C0296q) {
            Iterator it = ((C0296q) th).m1447e().iterator();
            while (it.hasNext()) {
                m1442a((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1443b(List list, Appendable appendable) {
        try {
            m1444c(list, appendable);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m1444c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            appendable.append("Cause (").append(String.valueOf(i8)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i7);
            if (th instanceof C0296q) {
                ((C0296q) th).m1446h(appendable);
            } else {
                m1445d(th, appendable);
            }
            i7 = i8;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m1445d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m1446h(Appendable appendable) {
        m1445d(this, appendable);
        m1443b(m1447e(), new a(appendable));
    }

    /* JADX INFO: renamed from: e */
    public List m1447e() {
        return this.f1236a;
    }

    /* JADX INFO: renamed from: f */
    public List m1448f() {
        ArrayList arrayList = new ArrayList();
        m1442a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m1449g(String str) {
        List listM1448f = m1448f();
        int size = listM1448f.size();
        int i7 = 0;
        while (i7 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i8 = i7 + 1;
            sb.append(i8);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) listM1448f.get(i7));
            i7 = i8;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f1240e);
        sb.append(this.f1239d != null ? ", " + this.f1239d : "");
        sb.append(this.f1238c != null ? ", " + this.f1238c : "");
        sb.append(this.f1237b != null ? ", " + this.f1237b : "");
        List<Throwable> listM1448f = m1448f();
        if (listM1448f.isEmpty()) {
            return sb.toString();
        }
        if (listM1448f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listM1448f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listM1448f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    void m1450i(InterfaceC0130f interfaceC0130f, EnumC0125a enumC0125a) {
        m1451j(interfaceC0130f, enumC0125a, null);
    }

    /* JADX INFO: renamed from: j */
    void m1451j(InterfaceC0130f interfaceC0130f, EnumC0125a enumC0125a, Class cls) {
        this.f1237b = interfaceC0130f;
        this.f1238c = enumC0125a;
        this.f1239d = cls;
    }

    /* JADX INFO: renamed from: k */
    public void m1452k(Exception exc) {
        this.f1241f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public C0296q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m1446h(printStream);
    }

    public C0296q(String str, List list) {
        this.f1240e = str;
        setStackTrace(f1235r);
        this.f1236a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m1446h(printWriter);
    }

    /* JADX INFO: renamed from: E1.q$a */
    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a */
        private final Appendable f1242a;

        /* JADX INFO: renamed from: b */
        private boolean f1243b = true;

        a(Appendable appendable) {
            this.f1242a = appendable;
        }

        /* JADX INFO: renamed from: a */
        private CharSequence m1453a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c7) throws IOException {
            if (this.f1243b) {
                this.f1243b = false;
                this.f1242a.append("  ");
            }
            this.f1243b = c7 == '\n';
            this.f1242a.append(c7);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceM1453a = m1453a(charSequence);
            return append(charSequenceM1453a, 0, charSequenceM1453a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i7, int i8) throws IOException {
            CharSequence charSequenceM1453a = m1453a(charSequence);
            boolean z7 = false;
            if (this.f1243b) {
                this.f1243b = false;
                this.f1242a.append("  ");
            }
            if (charSequenceM1453a.length() > 0 && charSequenceM1453a.charAt(i8 - 1) == '\n') {
                z7 = true;
            }
            this.f1243b = z7;
            this.f1242a.append(charSequenceM1453a, i7, i8);
            return this;
        }
    }
}
