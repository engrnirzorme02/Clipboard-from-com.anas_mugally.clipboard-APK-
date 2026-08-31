package p175X0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C2910a;
import androidx.work.impl.utils.futures.C2913c;
import java.util.UUID;
import p112O0.AbstractC1097j;
import p112O0.C1092e;
import p112O0.EnumC1106s;
import p112O0.InterfaceC1093f;
import p157U3.InterfaceFutureC1673e;
import p161V0.InterfaceC1711a;
import p168W0.InterfaceC1815q;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: X0.p */
/* JADX INFO: loaded from: classes.dex */
public class C1938p implements InterfaceC1093f {

    /* JADX INFO: renamed from: d */
    private static final String f6405d = AbstractC1097j.m4846f("WMFgUpdater");

    /* JADX INFO: renamed from: a */
    private final InterfaceC2010a f6406a;

    /* JADX INFO: renamed from: b */
    final InterfaceC1711a f6407b;

    /* JADX INFO: renamed from: c */
    final InterfaceC1815q f6408c;

    /* JADX INFO: renamed from: X0.p$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2913c f6409a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ UUID f6410b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C1092e f6411c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Context f6412d;

        a(C2913c c2913c, UUID uuid, C1092e c1092e, Context context) {
            this.f6409a = c2913c;
            this.f6410b = uuid;
            this.f6411c = c1092e;
            this.f6412d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f6409a.isCancelled()) {
                    String string = this.f6410b.toString();
                    EnumC1106s enumC1106sMo7549m = C1938p.this.f6408c.mo7549m(string);
                    if (enumC1106sMo7549m == null || enumC1106sMo7549m.m4861c()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C1938p.this.f6407b.mo5127a(string, this.f6411c);
                    this.f6412d.startService(C2910a.m14585a(this.f6412d, string, this.f6411c));
                }
                this.f6409a.mo14619o(null);
            } catch (Throwable th) {
                this.f6409a.mo14620p(th);
            }
        }
    }

    public C1938p(WorkDatabase workDatabase, InterfaceC1711a interfaceC1711a, InterfaceC2010a interfaceC2010a) {
        this.f6407b = interfaceC1711a;
        this.f6406a = interfaceC2010a;
        this.f6408c = workDatabase.mo14518K();
    }

    @Override // p112O0.InterfaceC1093f
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC1673e mo4838a(Context context, UUID uuid, C1092e c1092e) {
        C2913c c2913cM14629s = C2913c.m14629s();
        this.f6406a.mo8371b(new a(c2913cM14629s, uuid, c1092e, context));
        return c2913cM14629s;
    }
}
