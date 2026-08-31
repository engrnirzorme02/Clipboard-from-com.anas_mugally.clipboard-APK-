package p175X0;

import androidx.work.impl.WorkDatabase;
import p112O0.AbstractC1097j;
import p112O0.EnumC1106s;
import p119P0.C1177d;
import p119P0.C1182i;
import p168W0.InterfaceC1815q;

/* JADX INFO: renamed from: X0.m */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1935m implements Runnable {

    /* JADX INFO: renamed from: d */
    private static final String f6388d = AbstractC1097j.m4846f("StopWorkRunnable");

    /* JADX INFO: renamed from: a */
    private final C1182i f6389a;

    /* JADX INFO: renamed from: b */
    private final String f6390b;

    /* JADX INFO: renamed from: c */
    private final boolean f6391c;

    public RunnableC1935m(C1182i c1182i, String str, boolean z7) {
        this.f6389a = c1182i;
        this.f6390b = str;
        this.f6391c = z7;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM5138o;
        WorkDatabase workDatabaseM5173o = this.f6389a.m5173o();
        C1177d c1177dM5171m = this.f6389a.m5171m();
        InterfaceC1815q interfaceC1815qMo14518K = workDatabaseM5173o.mo14518K();
        workDatabaseM5173o.m33029e();
        try {
            boolean zM5132h = c1177dM5171m.m5132h(this.f6390b);
            if (this.f6391c) {
                zM5138o = this.f6389a.m5171m().m5137n(this.f6390b);
            } else {
                if (!zM5132h && interfaceC1815qMo14518K.mo7549m(this.f6390b) == EnumC1106s.RUNNING) {
                    interfaceC1815qMo14518K.mo7546j(EnumC1106s.ENQUEUED, this.f6390b);
                }
                zM5138o = this.f6389a.m5171m().m5138o(this.f6390b);
            }
            AbstractC1097j.m4844c().mo4847a(f6388d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f6390b, Boolean.valueOf(zM5138o)), new Throwable[0]);
            workDatabaseM5173o.m33042z();
        } finally {
            workDatabaseM5173o.m33031i();
        }
    }
}
