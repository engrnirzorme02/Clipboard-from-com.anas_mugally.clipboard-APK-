package p228d4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p276j4.AbstractC5868F;

/* JADX INFO: renamed from: d4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5238j {

    /* JADX INFO: renamed from: a */
    public static final C5238j f19969a = new C5238j();

    private C5238j() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC5868F.e.d.a.c m24191c(C5238j c5238j, String str, int i7, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        if ((i9 & 8) != 0) {
            z7 = false;
        }
        return c5238j.m24194b(str, i7, i8, z7);
    }

    /* JADX INFO: renamed from: f */
    private final String m24192f() {
        String processName;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 33) {
            return (i7 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        AbstractC6118n.m27184b(strMyProcessName);
        return strMyProcessName;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5868F.e.d.a.c m24193a(String processName, int i7, int i8) {
        AbstractC6118n.m27187e(processName, "processName");
        return m24191c(this, processName, i7, i8, false, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5868F.e.d.a.c m24194b(String processName, int i7, int i8, boolean z7) {
        AbstractC6118n.m27187e(processName, "processName");
        AbstractC5868F.e.d.a.c cVarMo26545a = AbstractC5868F.e.d.a.c.m26540a().mo26549e(processName).mo26548d(i7).mo26547c(i8).mo26546b(z7).mo26545a();
        AbstractC6118n.m27186d(cVarMo26545a, "build(...)");
        return cVarMo26545a;
    }

    /* JADX INFO: renamed from: d */
    public final List m24195d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listJ;
        AbstractC6118n.m27187e(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listJ = activityManager.getRunningAppProcesses()) == null) {
            listJ = AbstractC1638q.m6765j();
        }
        List listG = AbstractC1638q.m6567G(listJ);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(AbstractC5868F.e.d.a.c.m26540a().mo26549e(runningAppProcessInfo.processName).mo26548d(runningAppProcessInfo.pid).mo26547c(runningAppProcessInfo.importance).mo26546b(AbstractC6118n.m27183a(runningAppProcessInfo.processName, str)).mo26545a());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC5868F.e.d.a.c m24196e(Context context) {
        Object next;
        AbstractC6118n.m27187e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = m24195d(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbstractC5868F.e.d.a.c) next).mo26542c() != iMyPid);
        AbstractC5868F.e.d.a.c cVar = (AbstractC5868F.e.d.a.c) next;
        return cVar == null ? m24191c(this, m24192f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
