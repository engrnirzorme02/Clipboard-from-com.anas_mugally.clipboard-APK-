package p301m5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p086K4.InterfaceC0745a;
import p102M4.C0899d;
import p164V3.C1762g;
import p309n5.InterfaceC6503c;
import p327p5.C6767j;

/* JADX INFO: renamed from: m5.J */
/* JADX INFO: loaded from: classes.dex */
public final class C6356J {

    /* JADX INFO: renamed from: a */
    public static final C6356J f24229a = new C6356J();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0745a f24230b;

    static {
        InterfaceC0745a interfaceC0745aM4076i = new C0899d().m4077j(C6375c.f24336a).m4078k(true).m4076i();
        AbstractC6118n.m27186d(interfaceC0745aM4076i, "build(...)");
        f24230b = interfaceC0745aM4076i;
    }

    private C6356J() {
    }

    /* JADX INFO: renamed from: d */
    private final EnumC6376d m27402d(InterfaceC6503c interfaceC6503c) {
        if (interfaceC6503c == null) {
            return EnumC6376d.COLLECTION_SDK_NOT_INSTALLED;
        }
        return interfaceC6503c.mo24819b() ? EnumC6376d.COLLECTION_ENABLED : EnumC6376d.COLLECTION_DISABLED;
    }

    /* JADX INFO: renamed from: a */
    public final C6355I m27403a(C1762g firebaseApp, C6354H sessionDetails, C6767j sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC6118n.m27187e(firebaseApp, "firebaseApp");
        AbstractC6118n.m27187e(sessionDetails, "sessionDetails");
        AbstractC6118n.m27187e(sessionsSettings, "sessionsSettings");
        AbstractC6118n.m27187e(subscribers, "subscribers");
        AbstractC6118n.m27187e(firebaseInstallationId, "firebaseInstallationId");
        AbstractC6118n.m27187e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new C6355I(EnumC6382j.SESSION_START, new C6362P(sessionDetails.m27394b(), sessionDetails.m27393a(), sessionDetails.m27395c(), sessionDetails.m27396d(), new C6377e(m27402d((InterfaceC6503c) subscribers.get(InterfaceC6503c.a.PERFORMANCE)), m27402d((InterfaceC6503c) subscribers.get(InterfaceC6503c.a.CRASHLYTICS)), sessionsSettings.m29581a()), firebaseInstallationId, firebaseAuthenticationToken), m27404b(firebaseApp));
    }

    /* JADX INFO: renamed from: b */
    public final C6374b m27404b(C1762g firebaseApp) throws PackageManager.NameNotFoundException {
        AbstractC6118n.m27187e(firebaseApp, "firebaseApp");
        Context contextM7405l = firebaseApp.m7405l();
        AbstractC6118n.m27186d(contextM7405l, "getApplicationContext(...)");
        String packageName = contextM7405l.getPackageName();
        PackageInfo packageInfo = contextM7405l.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strM7423c = firebaseApp.m7407p().m7423c();
        AbstractC6118n.m27186d(strM7423c, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        AbstractC6118n.m27186d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC6118n.m27186d(RELEASE, "RELEASE");
        EnumC6393u enumC6393u = EnumC6393u.LOG_ENVIRONMENT_PROD;
        AbstractC6118n.m27184b(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        C6350D c6350d = C6350D.f24213a;
        Context contextM7405l2 = firebaseApp.m7405l();
        AbstractC6118n.m27186d(contextM7405l2, "getApplicationContext(...)");
        C6349C c6349cM27377b = c6350d.m27377b(contextM7405l2);
        Context contextM7405l3 = firebaseApp.m7405l();
        AbstractC6118n.m27186d(contextM7405l3, "getApplicationContext(...)");
        return new C6374b(strM7423c, MODEL, "3.0.2", RELEASE, enumC6393u, new C6372a(packageName, str2, strValueOf, MANUFACTURER, c6349cM27377b, c6350d.m27376a(contextM7405l3)));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0745a m27405c() {
        return f24230b;
    }
}
