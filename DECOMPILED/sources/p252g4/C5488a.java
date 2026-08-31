package p252g4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import p228d4.C5234f;

/* JADX INFO: renamed from: g4.a */
/* JADX INFO: loaded from: classes.dex */
public class C5488a {

    /* JADX INFO: renamed from: a */
    public final String f20821a;

    /* JADX INFO: renamed from: b */
    public final String f20822b;

    /* JADX INFO: renamed from: c */
    public final List f20823c;

    /* JADX INFO: renamed from: d */
    public final String f20824d;

    /* JADX INFO: renamed from: e */
    public final String f20825e;

    /* JADX INFO: renamed from: f */
    public final String f20826f;

    /* JADX INFO: renamed from: g */
    public final String f20827g;

    /* JADX INFO: renamed from: h */
    public final C5234f f20828h;

    public C5488a(String str, String str2, List list, String str3, String str4, String str5, String str6, C5234f c5234f) {
        this.f20821a = str;
        this.f20822b = str2;
        this.f20823c = list;
        this.f20824d = str3;
        this.f20825e = str4;
        this.f20826f = str5;
        this.f20827g = str6;
        this.f20828h = c5234f;
    }

    /* JADX INFO: renamed from: a */
    public static C5488a m24757a(Context context, C5470H c5470h, String str, String str2, List list, C5234f c5234f) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strM24708g = c5470h.m24708g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strM24758b = m24758b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C5488a(str, str2, list, strM24708g, packageName, strM24758b, str3, c5234f);
    }

    /* JADX INFO: renamed from: b */
    private static String m24758b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
