package com.anas_mugally.clipboard.p221ui;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.AbstractC2436b;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AppEnableProFeaturesActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p015B5.AbstractActivityC0091a;
import p023C5.C0148c;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class AppEnableProFeaturesActivity extends AbstractActivityC0091a {

    /* JADX INFO: renamed from: q0 */
    public static final C3083b f12735q0 = new C3083b(null);

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.AppEnableProFeaturesActivity$a */
    public static final class C3082a {

        /* JADX INFO: renamed from: a */
        public static final a f12736a = new a(null);

        /* JADX INFO: renamed from: b */
        private static volatile C3082a f12737b;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.AppEnableProFeaturesActivity$a$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final C3082a m15362a() {
                C3082a c3082a;
                C3082a c3082a2 = C3082a.f12737b;
                if (c3082a2 != null) {
                    return c3082a2;
                }
                synchronized (this) {
                    c3082a = C3082a.f12737b;
                    if (c3082a == null) {
                        c3082a = new C3082a();
                        C3082a.f12737b = c3082a;
                    }
                }
                return c3082a;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: c */
        private final List m15358c(Context context, String str) {
            String packageName = context.getPackageName();
            if (AbstractC1638q.m6767l("xiaomi", "redmi", "poco").contains(str)) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
                C1444v c1444v = C1444v.f4971a;
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent2.putExtra("extra_pkgname", packageName);
                Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName("com.xiaomi.mipermission.permission", "com.xiaomi.mipermission.permission.AutoStartManagementActivity"));
                Intent intent4 = new Intent("miui.intent.action.OP_AUTO_START");
                intent4.addCategory("android.intent.category.DEFAULT");
                return AbstractC1638q.m6767l(intent, intent2, intent3, intent4);
            }
            if (AbstractC1638q.m6767l("huawei", "honor").contains(str)) {
                Intent intent5 = new Intent();
                intent5.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"));
                C1444v c1444v2 = C1444v.f4971a;
                Intent intent6 = new Intent();
                intent6.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));
                Intent intent7 = new Intent();
                intent7.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"));
                return AbstractC1638q.m6767l(intent5, intent6, intent7);
            }
            if (AbstractC1638q.m6767l("oppo", "realme").contains(str)) {
                Intent intent8 = new Intent();
                intent8.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity"));
                C1444v c1444v3 = C1444v.f4971a;
                Intent intent9 = new Intent();
                intent9.setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity"));
                Intent intent10 = new Intent();
                intent10.setComponent(new ComponentName("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"));
                Intent intent11 = new Intent();
                intent11.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity"));
                return AbstractC1638q.m6767l(intent8, intent9, intent10, intent11);
            }
            if (AbstractC1638q.m6767l("vivo", "iqoo").contains(str)) {
                Intent intent12 = new Intent();
                intent12.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"));
                C1444v c1444v4 = C1444v.f4971a;
                Intent intent13 = new Intent();
                intent13.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"));
                Intent intent14 = new Intent();
                intent14.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"));
                Intent intent15 = new Intent();
                intent15.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity"));
                return AbstractC1638q.m6767l(intent12, intent13, intent14, intent15);
            }
            if (AbstractC6118n.m27183a(str, "oneplus")) {
                Intent intent16 = new Intent();
                intent16.setComponent(new ComponentName("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"));
                C1444v c1444v5 = C1444v.f4971a;
                Intent intent17 = new Intent();
                intent17.setComponent(new ComponentName("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListAcitvity"));
                return AbstractC1638q.m6767l(intent16, intent17);
            }
            if (AbstractC6118n.m27183a(str, "samsung")) {
                Intent intent18 = new Intent();
                intent18.setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity"));
                C1444v c1444v6 = C1444v.f4971a;
                Intent intent19 = new Intent();
                intent19.setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.battery.ui.BatteryActivity"));
                return AbstractC1638q.m6767l(intent18, intent19);
            }
            if (AbstractC6118n.m27183a(str, "asus")) {
                Intent intent20 = new Intent();
                intent20.setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.powersaver.PowerSaverSettings"));
                C1444v c1444v7 = C1444v.f4971a;
                Intent intent21 = new Intent();
                intent21.setComponent(new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity"));
                return AbstractC1638q.m6767l(intent20, intent21);
            }
            if (AbstractC6118n.m27183a(str, "lenovo")) {
                Intent intent22 = new Intent();
                intent22.setComponent(new ComponentName("com.lenovo.security", "com.lenovo.security.purebackground.PureBackgroundActivity"));
                return AbstractC1638q.m6759d(intent22);
            }
            if (AbstractC6118n.m27183a(str, "nokia")) {
                Intent intent23 = new Intent();
                intent23.setComponent(new ComponentName("com.evenwell.powersaving.g3", "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity"));
                return AbstractC1638q.m6759d(intent23);
            }
            if (!AbstractC6118n.m27183a(str, "meizu")) {
                return AbstractC1638q.m6765j();
            }
            Intent intent24 = new Intent();
            intent24.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.permission.SmartBGActivity"));
            return AbstractC1638q.m6759d(intent24);
        }

        /* JADX INFO: renamed from: f */
        private final boolean m15359f(Context context, Intent intent) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return (Build.VERSION.SDK_INT >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.resolveActivity(intent, 65536)) != null;
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15360d(Context context) {
            AbstractC6118n.m27187e(context, "context");
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
            Locale ROOT = Locale.ROOT;
            AbstractC6118n.m27186d(ROOT, "ROOT");
            String lowerCase = MANUFACTURER.toLowerCase(ROOT);
            AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
            for (Object obj : m15358c(context, lowerCase)) {
                AbstractC6118n.m27186d(obj, "next(...)");
                Intent intent = (Intent) obj;
                if (m15359f(context, intent)) {
                    try {
                        context.startActivity(intent);
                        return true;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m15361e(Context context) {
            AbstractC6118n.m27187e(context, "context");
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
            Locale ROOT = Locale.ROOT;
            AbstractC6118n.m27186d(ROOT, "ROOT");
            String lowerCase = MANUFACTURER.toLowerCase(ROOT);
            AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
            List listM15358c = m15358c(context, lowerCase);
            if (listM15358c != null && listM15358c.isEmpty()) {
                return false;
            }
            Iterator it = listM15358c.iterator();
            while (it.hasNext()) {
                if (m15359f(context, (Intent) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.AppEnableProFeaturesActivity$b */
    public static final class C3083b {
        public /* synthetic */ C3083b(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3083b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final void m15316A2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15345p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final void m15317B2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15352w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final void m15318C2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15349t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m15319D2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15348s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final void m15320E2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15328M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final void m15321F2(C3082a c3082a, AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        c3082a.m15360d(appEnableProFeaturesActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final void m15322G2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15346q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final void m15323H2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15350u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final void m15324I2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, View view) {
        appEnableProFeaturesActivity.m15347r2();
    }

    /* JADX INFO: renamed from: J2 */
    private final boolean m15325J2() {
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        Locale ROOT = Locale.ROOT;
        AbstractC6118n.m27186d(ROOT, "ROOT");
        String lowerCase = MANUFACTURER.toLowerCase(ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        if (AbstractC1638q.m6767l("xiaomi", "redmi", "poco", "oppo", "realme", "oneplus", "vivo", "iqoo", "huawei", "honor").contains(lowerCase)) {
            return true;
        }
        return (AbstractC6118n.m27183a(lowerCase, "samsung") && Build.VERSION.SDK_INT >= 29) || Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: K2 */
    private final void m15326K2(String str, String str2) {
        new C7611b(this).m33365P(R.string.lock_app_dialog_title).mo9105i(str).m33361L(R.string.understood, new DialogInterface.OnClickListener() { // from class: l1.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AppEnableProFeaturesActivity.m15327L2(this.f24003a, dialogInterface, i7);
            }
        }).m33356G(R.string.skip, null).m33352C(R.drawable.ic_locked_tab).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final void m15327L2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        appEnableProFeaturesActivity.m15351v2();
    }

    /* JADX INFO: renamed from: M2 */
    private final void m15328M2() {
        String string;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        Locale ROOT = Locale.ROOT;
        AbstractC6118n.m27186d(ROOT, "ROOT");
        String lowerCase = MANUFACTURER.toLowerCase(ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        if (AbstractC1638q.m6767l("xiaomi", "redmi", "poco").contains(lowerCase)) {
            string = getString(R.string.lock_app_guide_miui);
        } else if (AbstractC1638q.m6767l("oppo", "realme").contains(lowerCase)) {
            string = getString(R.string.lock_app_guide_coloros);
        } else if (AbstractC1638q.m6767l("vivo", "iqoo").contains(lowerCase)) {
            string = getString(R.string.lock_app_guide_vivo);
        } else if (AbstractC6118n.m27183a(lowerCase, "oneplus")) {
            string = getString(R.string.lock_app_guide_oneplus);
        } else if (AbstractC1638q.m6767l("huawei", "honor").contains(lowerCase)) {
            string = getString(R.string.lock_app_guide_huawei);
        } else {
            string = AbstractC6118n.m27183a(lowerCase, "samsung") ? getString(R.string.lock_app_guide_samsung) : getString(R.string.lock_app_guide_general);
        }
        AbstractC6118n.m27184b(string);
        m15326K2(string, lowerCase);
    }

    /* JADX INFO: renamed from: k2 */
    private final String m15340k2() {
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 0);
            AbstractC6118n.m27186d(applicationInfo, "getApplicationInfo(...)");
            return getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Exception unused) {
            String packageName = getPackageName();
            AbstractC6118n.m27184b(packageName);
            return packageName;
        }
    }

    /* JADX INFO: renamed from: l2 */
    private final boolean m15341l2() {
        Object systemService = getSystemService("power");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isIgnoringBatteryOptimizations(getPackageName());
    }

    /* JADX INFO: renamed from: m2 */
    private final boolean m15342m2(Intent intent) {
        try {
            return getPackageManager().resolveActivity(intent, 65536) != null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: n2 */
    private final boolean m15343n2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: o2 */
    private final boolean m15344o2() {
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        Locale ROOT = Locale.ROOT;
        AbstractC6118n.m27186d(ROOT, "ROOT");
        String lowerCase = MANUFACTURER.toLowerCase(ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        return AbstractC1638q.m6767l("xiaomi", "redmi", "poco", "huawei", "honor", "oppo", "realme", "vivo", "oneplus").contains(lowerCase);
    }

    /* JADX INFO: renamed from: p2 */
    private final void m15345p2() {
        startActivity(new Intent(this, (Class<?>) AccessibilitySettingActivity.class).addFlags(872415232));
    }

    /* JADX INFO: renamed from: q2 */
    private final void m15346q2() {
        Intent[] intentArr;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        Locale ROOT = Locale.ROOT;
        AbstractC6118n.m27186d(ROOT, "ROOT");
        String lowerCase = MANUFACTURER.toLowerCase(ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        try {
            if (AbstractC1638q.m6767l("xiaomi", "redmi", "poco").contains(lowerCase)) {
                intentArr = new Intent[]{new Intent().setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity")).putExtra("package_name", getPackageName()).putExtra("package_label", m15340k2()), new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").putExtra("package_name", getPackageName()).putExtra("package_label", m15340k2()), new Intent().setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity"))};
            } else if (AbstractC1638q.m6767l("huawei", "honor").contains(lowerCase)) {
                intentArr = new Intent[]{new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity")), new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"))};
            } else if (AbstractC1638q.m6767l("oppo", "realme").contains(lowerCase)) {
                intentArr = new Intent[]{new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity")), new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppListActivity"))};
            } else if (AbstractC6118n.m27183a(lowerCase, "vivo")) {
                intentArr = new Intent[]{new Intent().setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity")), new Intent().setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity")), new Intent().setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity"))};
            } else if (AbstractC6118n.m27183a(lowerCase, "samsung")) {
                intentArr = new Intent[]{new Intent().setComponent(new ComponentName("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity")), new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + getPackageName()))};
            } else {
                intentArr = AbstractC6118n.m27183a(lowerCase, "oneplus") ? new Intent[]{new Intent().setComponent(new ComponentName("com.oneplus.security", "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"))} : new Intent[0];
            }
            for (Intent intent : intentArr) {
                AbstractC6118n.m27184b(intent);
                if (m15342m2(intent)) {
                    startActivity(intent);
                    return;
                }
            }
            m15347r2();
        } catch (Exception e7) {
            e7.printStackTrace();
            m15347r2();
        }
    }

    /* JADX INFO: renamed from: r2 */
    private final void m15347r2() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, R.string.error_not_spicfical, 0).show();
        }
    }

    /* JADX INFO: renamed from: s2 */
    private final void m15348s2() {
        try {
            if (m15341l2()) {
                m15347r2();
                return;
            }
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivity(intent);
        } catch (Exception e7) {
            e7.printStackTrace();
            m15347r2();
        }
    }

    /* JADX INFO: renamed from: t2 */
    private final void m15349t2() {
        startActivity(new Intent(this, (Class<?>) BubbleCustomizationActivity.class).addFlags(872415232));
    }

    /* JADX INFO: renamed from: u2 */
    private final void m15350u2() {
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", getPackageName());
            C1444v c1444v = C1444v.f4971a;
            Intent[] intentArr = {intent, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity")).putExtra("extra_pkgname", getPackageName()), new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity")).putExtra("extra_pkgname", getPackageName()), new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + getPackageName()))};
            for (int i7 = 0; i7 < 4; i7++) {
                Intent intent2 = intentArr[i7];
                AbstractC6118n.m27184b(intent2);
                if (m15342m2(intent2)) {
                    startActivity(intent2);
                    return;
                }
            }
            m15347r2();
        } catch (Exception e7) {
            e7.printStackTrace();
            m15347r2();
        }
    }

    /* JADX INFO: renamed from: v2 */
    private final void m15351v2() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            Toast.makeText(this, R.string.open_recent_apps_manually, 1).show();
        } catch (Exception unused) {
            Toast.makeText(this, R.string.open_recent_apps_manually, 1).show();
        }
    }

    /* JADX INFO: renamed from: w2 */
    private final void m15352w2() {
        startActivity(new Intent(this, (Class<?>) SettingActivity.class).addFlags(872415232));
    }

    /* JADX INFO: renamed from: x2 */
    private final void m15353x2() {
        if (m15343n2()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mi_frame);
        AbstractC1030Z.m4494t0(viewGroup, new InterfaceC0993G() { // from class: l1.k
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return AppEnableProFeaturesActivity.m15354y2(this.f24034a, viewGroup, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final C0982A0 m15354y2(AppEnableProFeaturesActivity appEnableProFeaturesActivity, ViewGroup viewGroup, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        if (C3034A.f12453a.m15018E(appEnableProFeaturesActivity)) {
            AbstractC6118n.m27184b(viewGroup);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), c0247bM4272f.f986c, viewGroup.getPaddingBottom());
        } else {
            AbstractC6118n.m27184b(viewGroup);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), c0247bM4272f.f987d);
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: z2 */
    private final void m15355z2() {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (!AbstractC3081u.m15315b(application)) {
            m352j1(new C0148c.b().m671z(R.string.accessibility_service).m668w(R.string.enable_accessibility_service_desc).m663r(R.color.intro_slide_1).m664s(R.color.intro_slide_1).m669x(R.drawable.ic_pro_setting).m670y(false).m666u(new View.OnClickListener() { // from class: l1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15316A2(this.f24000a, view);
                }
            }).m667v(R.string.go_to_accessibility_setting).m665t());
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && AbstractC2436b.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            m352j1(new C0148c.b().m671z(R.string.notification_permission_title).m668w(R.string.notification_permission_desc).m663r(R.color.intro_slide_2).m664s(R.color.intro_slide_2).m669x(R.drawable.round_circle_notifications_24).m670y(false).m666u(new View.OnClickListener() { // from class: l1.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15317B2(this.f24008a, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        if (AbstractC3041D.m15080e(this)) {
            m352j1(new C0148c.b().m671z(R.string.show_over_app).m668w(R.string.please_enbale_show_over_app_xioami).m663r(R.color.intro_slide_3).m664s(R.color.intro_slide_3).m669x(R.drawable.ic_bubble).m670y(false).m666u(new View.OnClickListener() { // from class: l1.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15318C2(this.f24012a, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        if (!m15341l2()) {
            m352j1(new C0148c.b().m671z(R.string.battery_optimization_title).m668w(R.string.battery_optimization_desc).m663r(R.color.intro_slide_4).m664s(R.color.intro_slide_4).m669x(R.drawable.rounded_battery_android_frame_shield_24).m670y(false).m666u(new View.OnClickListener() { // from class: l1.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15319D2(this.f24015a, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        if (m15325J2()) {
            m352j1(new C0148c.b().m671z(R.string.lock_app_recent_title).m668w(R.string.lock_app_recent_desc).m663r(R.color.intro_slide_3).m664s(R.color.intro_slide_3).m669x(R.drawable.ic_locked_tab).m670y(false).m666u(new View.OnClickListener() { // from class: l1.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15320E2(this.f24018a, view);
                }
            }).m667v(R.string.show_me_how).m665t());
        }
        final C3082a c3082aM15362a = C3082a.f12736a.m15362a();
        if (c3082aM15362a.m15361e(this)) {
            m352j1(new C0148c.b().m671z(R.string.auto_start).m668w(R.string.please_enbale_auto_start).m663r(R.color.intro_slide_5).m664s(R.color.intro_slide_5).m669x(R.drawable.round_auto_mode_24).m670y(false).m666u(new View.OnClickListener() { // from class: l1.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15321F2(c3082aM15362a, this, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        if (m15344o2()) {
            m352j1(new C0148c.b().m671z(R.string.advanced_power_settings_title).m668w(R.string.advanced_power_settings_desc).m663r(R.color.intro_slide_6).m664s(R.color.intro_slide_6).m669x(R.drawable.rounded_battery_android_frame_shield_24).m670y(false).m666u(new View.OnClickListener() { // from class: l1.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15322G2(this.f24025a, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6118n.m27186d(MANUFACTURER, "MANUFACTURER");
        Locale ROOT = Locale.ROOT;
        AbstractC6118n.m27186d(ROOT, "ROOT");
        String lowerCase = MANUFACTURER.toLowerCase(ROOT);
        AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
        boolean z7 = AbstractC6118n.m27183a(lowerCase, "xiaomi") || AbstractC6118n.m27183a(lowerCase, "redmi") || AbstractC6118n.m27183a(lowerCase, "poco");
        if (z7) {
            m352j1(new C0148c.b().m671z(R.string.miui_special_settings_title).m668w(R.string.miui_special_settings_desc).m663r(R.color.intro_slide_7).m664s(R.color.intro_slide_7).m669x(R.drawable.ic_pro_setting).m670y(false).m666u(new View.OnClickListener() { // from class: l1.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppEnableProFeaturesActivity.m15323H2(this.f24028a, view);
                }
            }).m667v(R.string.go_to_setting).m665t());
        }
        if (i7 < 30 || z7) {
            return;
        }
        m352j1(new C0148c.b().m671z(R.string.app_hibernation_title).m668w(R.string.app_hibernation_desc).m663r(R.color.intro_slide_8).m664s(R.color.intro_slide_8).m669x(R.drawable.round_auto_mode_24).m670y(false).m666u(new View.OnClickListener() { // from class: l1.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppEnableProFeaturesActivity.m15324I2(this.f24031a, view);
            }
        }).m667v(R.string.go_to_setting).m665t());
    }

    @Override // android.app.Activity
    public void finish() {
        finishAndRemoveTask();
    }

    @Override // p015B5.AbstractActivityC0091a, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15355z2();
        m15353x2();
        m350I1(false);
        m351J1(true);
    }

    @Override // p015B5.AbstractActivityC0091a, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        finishAndRemoveTask();
    }
}
