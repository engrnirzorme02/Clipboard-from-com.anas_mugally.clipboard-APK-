package p119P0;

import android.content.Context;
import androidx.work.C2895a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p133R0.C1306e;
import p168W0.C1814p;
import p168W0.InterfaceC1815q;
import p175X0.AbstractC1929g;

/* JADX INFO: renamed from: P0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1179f {

    /* JADX INFO: renamed from: a */
    private static final String f4158a = AbstractC1097j.m4846f("Schedulers");

    /* JADX INFO: renamed from: a */
    static InterfaceC1178e m5142a(Context context, C1182i c1182i) {
        C1306e c1306e = new C1306e(context, c1182i);
        AbstractC1929g.m7977a(context, SystemJobService.class, true);
        AbstractC1097j.m4844c().mo4847a(f4158a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return c1306e;
    }

    /* JADX INFO: renamed from: b */
    public static void m5143b(C2895a c2895a, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC1815q interfaceC1815qMo14518K = workDatabase.mo14518K();
        workDatabase.m33029e();
        try {
            List listMo7541e = interfaceC1815qMo14518K.mo7541e(c2895a.m14487h());
            List listMo7556t = interfaceC1815qMo14518K.mo7556t(200);
            if (listMo7541e != null && listMo7541e.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listMo7541e.iterator();
                while (it.hasNext()) {
                    interfaceC1815qMo14518K.mo7538b(((C1814p) it.next()).f5892a, jCurrentTimeMillis);
                }
            }
            workDatabase.m33042z();
            workDatabase.m33031i();
            if (listMo7541e != null && listMo7541e.size() > 0) {
                C1814p[] c1814pArr = (C1814p[]) listMo7541e.toArray(new C1814p[listMo7541e.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1178e interfaceC1178e = (InterfaceC1178e) it2.next();
                    if (interfaceC1178e.mo5140c()) {
                        interfaceC1178e.mo5139a(c1814pArr);
                    }
                }
            }
            if (listMo7556t == null || listMo7556t.size() <= 0) {
                return;
            }
            C1814p[] c1814pArr2 = (C1814p[]) listMo7556t.toArray(new C1814p[listMo7556t.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                InterfaceC1178e interfaceC1178e2 = (InterfaceC1178e) it3.next();
                if (!interfaceC1178e2.mo5140c()) {
                    interfaceC1178e2.mo5139a(c1814pArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.m33031i();
            throw th;
        }
    }
}
