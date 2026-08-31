package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p140S0.C1385d;
import p168W0.C1814p;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.c */
/* JADX INFO: loaded from: classes.dex */
class C2904c {

    /* JADX INFO: renamed from: e */
    private static final String f11921e = AbstractC1097j.m4846f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a */
    private final Context f11922a;

    /* JADX INFO: renamed from: b */
    private final int f11923b;

    /* JADX INFO: renamed from: c */
    private final C2906e f11924c;

    /* JADX INFO: renamed from: d */
    private final C1385d f11925d;

    C2904c(Context context, int i7, C2906e c2906e) {
        this.f11922a = context;
        this.f11923b = i7;
        this.f11924c = c2906e;
        this.f11925d = new C1385d(context, c2906e.m14574f(), null);
    }

    /* JADX INFO: renamed from: a */
    void m14564a() {
        List<C1814p> listMo7542f = this.f11924c.m14575g().m5173o().mo14518K().mo7542f();
        ConstraintProxy.m14542a(this.f11922a, listMo7542f);
        this.f11925d.m5957d(listMo7542f);
        ArrayList arrayList = new ArrayList(listMo7542f.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C1814p c1814p : listMo7542f) {
            String str = c1814p.f5892a;
            if (jCurrentTimeMillis >= c1814p.m7532a() && (!c1814p.m7533b() || this.f11925d.m5956c(str))) {
                arrayList.add(c1814p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C1814p) it.next()).f5892a;
            Intent intentM14551b = C2903b.m14551b(this.f11922a, str2);
            AbstractC1097j.m4844c().mo4847a(f11921e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C2906e c2906e = this.f11924c;
            c2906e.m14578k(new C2906e.b(c2906e, intentM14551b, this.f11923b));
        }
        this.f11925d.m5958e();
    }
}
