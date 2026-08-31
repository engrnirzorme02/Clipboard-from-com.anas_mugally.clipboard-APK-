package p322p0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6715a extends AbstractC6716b {

    /* JADX INFO: renamed from: i */
    private Executor f26140i;

    /* JADX INFO: renamed from: j */
    private volatile a f26141j;

    /* JADX INFO: renamed from: k */
    private volatile a f26142k;

    /* JADX INFO: renamed from: l */
    private long f26143l;

    /* JADX INFO: renamed from: m */
    private long f26144m;

    /* JADX INFO: renamed from: n */
    private Handler f26145n;

    /* JADX INFO: renamed from: p0.a$a */
    final class a extends AbstractC6717c implements Runnable {

        /* JADX INFO: renamed from: f */
        boolean f26146f;

        a() {
        }

        @Override // p322p0.AbstractC6717c
        /* JADX INFO: renamed from: b */
        protected Object mo29506b() {
            return AbstractC6715a.this.m29499E();
        }

        @Override // p322p0.AbstractC6717c
        /* JADX INFO: renamed from: g */
        protected void mo29507g(Object obj) {
            AbstractC6715a.this.m29504y(this, obj);
        }

        @Override // p322p0.AbstractC6717c
        /* JADX INFO: renamed from: h */
        protected void mo29508h(Object obj) {
            AbstractC6715a.this.m29505z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26146f = false;
            AbstractC6715a.this.m29496A();
        }
    }

    public AbstractC6715a(Context context) {
        super(context);
        this.f26144m = -10000L;
    }

    /* JADX INFO: renamed from: A */
    void m29496A() {
        if (this.f26142k != null || this.f26141j == null) {
            return;
        }
        if (this.f26141j.f26146f) {
            this.f26141j.f26146f = false;
            this.f26145n.removeCallbacks(this.f26141j);
        }
        if (this.f26143l > 0 && SystemClock.uptimeMillis() < this.f26144m + this.f26143l) {
            this.f26141j.f26146f = true;
            this.f26145n.postAtTime(this.f26141j, this.f26144m + this.f26143l);
        } else {
            if (this.f26140i == null) {
                this.f26140i = m29497B();
            }
            this.f26141j.m29530c(this.f26140i);
        }
    }

    /* JADX INFO: renamed from: B */
    protected Executor m29497B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    /* JADX INFO: renamed from: C */
    public abstract Object mo5983C();

    /* JADX INFO: renamed from: D */
    public void m29498D(Object obj) {
    }

    /* JADX INFO: renamed from: E */
    protected Object m29499E() {
        return mo5983C();
    }

    @Override // p322p0.AbstractC6716b
    /* JADX INFO: renamed from: g */
    public void mo29500g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.mo29500g(str, fileDescriptor, printWriter, strArr);
        if (this.f26141j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f26141j);
            printWriter.print(" waiting=");
            printWriter.println(this.f26141j.f26146f);
        }
        if (this.f26142k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f26142k);
            printWriter.print(" waiting=");
            printWriter.println(this.f26142k.f26146f);
        }
        if (this.f26143l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f26143l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f26144m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f26144m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p322p0.AbstractC6716b
    /* JADX INFO: renamed from: l */
    protected boolean mo29501l() {
        if (this.f26141j == null) {
            return false;
        }
        if (!m29517j()) {
            m29519m();
        }
        if (this.f26142k != null) {
            if (this.f26141j.f26146f) {
                this.f26141j.f26146f = false;
                this.f26145n.removeCallbacks(this.f26141j);
            }
            this.f26141j = null;
            return false;
        }
        if (this.f26141j.f26146f) {
            this.f26141j.f26146f = false;
            this.f26145n.removeCallbacks(this.f26141j);
            this.f26141j = null;
            return false;
        }
        boolean zM29529a = this.f26141j.m29529a(false);
        if (zM29529a) {
            this.f26142k = this.f26141j;
            m29503x();
        }
        this.f26141j = null;
        return zM29529a;
    }

    @Override // p322p0.AbstractC6716b
    /* JADX INFO: renamed from: n */
    protected void mo29502n() {
        super.mo29502n();
        m29510b();
        this.f26141j = new a();
        m29496A();
    }

    /* JADX INFO: renamed from: x */
    public void m29503x() {
    }

    /* JADX INFO: renamed from: y */
    void m29504y(a aVar, Object obj) {
        m29498D(obj);
        if (this.f26142k == aVar) {
            m29524t();
            this.f26144m = SystemClock.uptimeMillis();
            this.f26142k = null;
            m29513e();
            m29496A();
        }
    }

    /* JADX INFO: renamed from: z */
    void m29505z(a aVar, Object obj) {
        if (this.f26141j != aVar) {
            m29504y(aVar, obj);
            return;
        }
        if (m29516i()) {
            m29498D(obj);
            return;
        }
        m29511c();
        this.f26144m = SystemClock.uptimeMillis();
        this.f26141j = null;
        m29514f(obj);
    }
}
