package p322p0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: p0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6716b {

    /* JADX INFO: renamed from: a */
    private int f26148a;

    /* JADX INFO: renamed from: b */
    private a f26149b;

    /* JADX INFO: renamed from: c */
    private Context f26150c;

    /* JADX INFO: renamed from: d */
    private boolean f26151d = false;

    /* JADX INFO: renamed from: e */
    private boolean f26152e = false;

    /* JADX INFO: renamed from: f */
    private boolean f26153f = true;

    /* JADX INFO: renamed from: g */
    private boolean f26154g = false;

    /* JADX INFO: renamed from: h */
    private boolean f26155h = false;

    /* JADX INFO: renamed from: p0.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12689a(AbstractC6716b abstractC6716b, Object obj);
    }

    public AbstractC6716b(Context context) {
        this.f26150c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public void m29509a() {
        this.f26152e = true;
        m29518k();
    }

    /* JADX INFO: renamed from: b */
    public boolean m29510b() {
        return mo29501l();
    }

    /* JADX INFO: renamed from: c */
    public void m29511c() {
        this.f26155h = false;
    }

    /* JADX INFO: renamed from: d */
    public String m29512d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m29513e() {
    }

    /* JADX INFO: renamed from: f */
    public void m29514f(Object obj) {
        a aVar = this.f26149b;
        if (aVar != null) {
            aVar.mo12689a(this, obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo29500g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f26148a);
        printWriter.print(" mListener=");
        printWriter.println(this.f26149b);
        if (this.f26151d || this.f26154g || this.f26155h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f26151d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f26154g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f26155h);
        }
        if (this.f26152e || this.f26153f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f26152e);
            printWriter.print(" mReset=");
            printWriter.println(this.f26153f);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m29515h() {
        mo29502n();
    }

    /* JADX INFO: renamed from: i */
    public boolean m29516i() {
        return this.f26152e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m29517j() {
        return this.f26151d;
    }

    /* JADX INFO: renamed from: k */
    protected void m29518k() {
    }

    /* JADX INFO: renamed from: l */
    protected abstract boolean mo29501l();

    /* JADX INFO: renamed from: m */
    public void m29519m() {
        if (this.f26151d) {
            m29515h();
        } else {
            this.f26154g = true;
        }
    }

    /* JADX INFO: renamed from: n */
    protected void mo29502n() {
    }

    /* JADX INFO: renamed from: o */
    protected void m29520o() {
    }

    /* JADX INFO: renamed from: p */
    protected abstract void mo5984p();

    /* JADX INFO: renamed from: q */
    protected void m29521q() {
    }

    /* JADX INFO: renamed from: r */
    public void m29522r(int i7, a aVar) {
        if (this.f26149b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f26149b = aVar;
        this.f26148a = i7;
    }

    /* JADX INFO: renamed from: s */
    public void m29523s() {
        m29520o();
        this.f26153f = true;
        this.f26151d = false;
        this.f26152e = false;
        this.f26154g = false;
        this.f26155h = false;
    }

    /* JADX INFO: renamed from: t */
    public void m29524t() {
        if (this.f26155h) {
            m29519m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f26148a);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m29525u() {
        this.f26151d = true;
        this.f26153f = false;
        this.f26152e = false;
        mo5984p();
    }

    /* JADX INFO: renamed from: v */
    public void m29526v() {
        this.f26151d = false;
        m29521q();
    }

    /* JADX INFO: renamed from: w */
    public void m29527w(a aVar) {
        a aVar2 = this.f26149b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f26149b = null;
    }
}
