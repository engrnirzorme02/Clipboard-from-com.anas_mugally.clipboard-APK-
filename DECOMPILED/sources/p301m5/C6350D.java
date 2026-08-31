package p301m5;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.AbstractC3763r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: m5.D */
/* JADX INFO: loaded from: classes.dex */
public final class C6350D {

    /* JADX INFO: renamed from: a */
    public static final C6350D f24213a = new C6350D();

    private C6350D() {
    }

    /* JADX INFO: renamed from: c */
    private final String m27375c() throws Throwable {
        String processName;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            String strMyProcessName = Process.myProcessName();
            AbstractC6118n.m27186d(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i7 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strM18205a = AbstractC3763r.m18205a();
        return strM18205a != null ? strM18205a : "";
    }

    /* JADX INFO: renamed from: a */
    public final List m27376a(Context context) {
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
            String processName = runningAppProcessInfo.processName;
            AbstractC6118n.m27186d(processName, "processName");
            arrayList2.add(new C6349C(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC6118n.m27183a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final C6349C m27377b(Context context) {
        Object next;
        AbstractC6118n.m27187e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = m27376a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C6349C) next).m27372b() != iMyPid);
        C6349C c6349c = (C6349C) next;
        return c6349c == null ? new C6349C(m27375c(), iMyPid, 0, false) : c6349c;
    }
}
