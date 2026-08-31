package p175X0;

import android.content.Context;
import androidx.work.C2896b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C2913c;
import java.util.UUID;
import p112O0.AbstractC1097j;
import p112O0.EnumC1106s;
import p112O0.InterfaceC1102o;
import p157U3.InterfaceFutureC1673e;
import p168W0.C1811m;
import p168W0.C1814p;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: X0.q */
/* JADX INFO: loaded from: classes.dex */
public class C1939q implements InterfaceC1102o {

    /* JADX INFO: renamed from: c */
    static final String f6414c = AbstractC1097j.m4846f("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    final WorkDatabase f6415a;

    /* JADX INFO: renamed from: b */
    final InterfaceC2010a f6416b;

    /* JADX INFO: renamed from: X0.q$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ UUID f6417a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2896b f6418b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2913c f6419c;

        a(UUID uuid, C2896b c2896b, C2913c c2913c) {
            this.f6417a = uuid;
            this.f6418b = c2896b;
            this.f6419c = c2913c;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f6417a.toString();
            AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
            String str = C1939q.f6414c;
            abstractC1097jM4844c.mo4847a(str, String.format("Updating progress for %s (%s)", this.f6417a, this.f6418b), new Throwable[0]);
            C1939q.this.f6415a.m33029e();
            try {
                C1814p c1814pMo7550n = C1939q.this.f6415a.mo14518K().mo7550n(string);
                if (c1814pMo7550n == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (c1814pMo7550n.f5893b == EnumC1106s.RUNNING) {
                    C1939q.this.f6415a.mo14517J().mo7530c(new C1811m(string, this.f6418b));
                } else {
                    AbstractC1097j.m4844c().mo4851h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                this.f6419c.mo14619o(null);
                C1939q.this.f6415a.m33042z();
                C1939q.this.f6415a.m33031i();
            } catch (Throwable th) {
                try {
                    AbstractC1097j.m4844c().mo4848b(C1939q.f6414c, "Error updating Worker progress", th);
                    this.f6419c.mo14620p(th);
                } finally {
                    C1939q.this.f6415a.m33031i();
                }
            }
        }
    }

    public C1939q(WorkDatabase workDatabase, InterfaceC2010a interfaceC2010a) {
        this.f6415a = workDatabase;
        this.f6416b = interfaceC2010a;
    }

    @Override // p112O0.InterfaceC1102o
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC1673e mo4858a(Context context, UUID uuid, C2896b c2896b) {
        C2913c c2913cM14629s = C2913c.m14629s();
        this.f6416b.mo8371b(new a(uuid, c2896b, c2913cM14629s));
        return c2913cM14629s;
    }
}
