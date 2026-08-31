package p175X0;

import androidx.work.WorkerParameters;
import p119P0.C1182i;

/* JADX INFO: renamed from: X0.l */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1934l implements Runnable {

    /* JADX INFO: renamed from: a */
    private C1182i f6385a;

    /* JADX INFO: renamed from: b */
    private String f6386b;

    /* JADX INFO: renamed from: c */
    private WorkerParameters.C2894a f6387c;

    public RunnableC1934l(C1182i c1182i, String str, WorkerParameters.C2894a c2894a) {
        this.f6385a = c1182i;
        this.f6386b = str;
        this.f6387c = c2894a;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f6385a.m5171m().m5135k(this.f6386b, this.f6387c);
    }
}
