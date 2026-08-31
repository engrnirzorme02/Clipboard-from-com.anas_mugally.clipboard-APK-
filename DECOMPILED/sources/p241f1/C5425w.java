package p241f1;

import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3069s;
import com.anas_mugally.clipboard.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: f1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5425w {

    /* JADX INFO: renamed from: a */
    private final Context f20649a;

    /* JADX INFO: renamed from: f1.w$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f20650a;

        /* JADX INFO: renamed from: b */
        private final String f20651b;

        /* JADX INFO: renamed from: c */
        private final String f20652c;

        /* JADX INFO: renamed from: d */
        private final String f20653d;

        /* JADX INFO: renamed from: e */
        private final String f20654e;

        /* JADX INFO: renamed from: f */
        private final String f20655f;

        public a(String appVersion, String osVersion, String deviceModel, String packageName, String theme, String currentLanguage) {
            AbstractC6118n.m27187e(appVersion, "appVersion");
            AbstractC6118n.m27187e(osVersion, "osVersion");
            AbstractC6118n.m27187e(deviceModel, "deviceModel");
            AbstractC6118n.m27187e(packageName, "packageName");
            AbstractC6118n.m27187e(theme, "theme");
            AbstractC6118n.m27187e(currentLanguage, "currentLanguage");
            this.f20650a = appVersion;
            this.f20651b = osVersion;
            this.f20652c = deviceModel;
            this.f20653d = packageName;
            this.f20654e = theme;
            this.f20655f = currentLanguage;
        }

        /* JADX INFO: renamed from: a */
        public final String m24597a() {
            return this.f20650a;
        }

        /* JADX INFO: renamed from: b */
        public final String m24598b() {
            return this.f20655f;
        }

        /* JADX INFO: renamed from: c */
        public final String m24599c() {
            return this.f20652c;
        }

        /* JADX INFO: renamed from: d */
        public final String m24600d() {
            return this.f20651b;
        }

        /* JADX INFO: renamed from: e */
        public final String m24601e() {
            return this.f20653d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6118n.m27183a(this.f20650a, aVar.f20650a) && AbstractC6118n.m27183a(this.f20651b, aVar.f20651b) && AbstractC6118n.m27183a(this.f20652c, aVar.f20652c) && AbstractC6118n.m27183a(this.f20653d, aVar.f20653d) && AbstractC6118n.m27183a(this.f20654e, aVar.f20654e) && AbstractC6118n.m27183a(this.f20655f, aVar.f20655f);
        }

        /* JADX INFO: renamed from: f */
        public final String m24602f() {
            return this.f20654e;
        }

        public int hashCode() {
            return (((((((((this.f20650a.hashCode() * 31) + this.f20651b.hashCode()) * 31) + this.f20652c.hashCode()) * 31) + this.f20653d.hashCode()) * 31) + this.f20654e.hashCode()) * 31) + this.f20655f.hashCode();
        }

        public String toString() {
            return "DeviceInfo(appVersion=" + this.f20650a + ", osVersion=" + this.f20651b + ", deviceModel=" + this.f20652c + ", packageName=" + this.f20653d + ", theme=" + this.f20654e + ", currentLanguage=" + this.f20655f + ')';
        }
    }

    public C5425w(Context context) {
        AbstractC6118n.m27187e(context, "context");
        this.f20649a = context;
    }

    /* JADX INFO: renamed from: b */
    private final void m24591b(Intent intent, List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(FileProvider.m10569h(this.f20649a, this.f20649a.getPackageName() + ".fileprovider", file));
            } catch (Exception unused) {
                arrayList.add(Uri.fromFile(file));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.addFlags(1);
    }

    /* JADX INFO: renamed from: c */
    private final String m24592c(a aVar) {
        return AbstractC6406h.m27540j("\n            Hello,\n            \n            I want to report an issue with the application.\n            \n            Device Details:\n            - App Version: " + aVar.m24597a() + "\n            - OS Version: " + aVar.m24600d() + "\n            - Device Model: " + aVar.m24599c() + "\n            - Theme: " + aVar.m24602f() + "\n            - Language: " + aVar.m24598b() + "\n            - Market: " + AbstractC3041D.m15085j() + "\n            - Package Name: " + aVar.m24601e() + "\n            \n            Please provide additional information here:\n            \n        ");
    }

    /* JADX INFO: renamed from: d */
    private final Intent m24593d(Intent intent) {
        PackageManager packageManager = this.f20649a.getPackageManager();
        Intent intent2 = new Intent("android.intent.action.SENDTO");
        intent2.setData(Uri.parse("mailto:"));
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent2, PackageManager.ResolveInfoFlags.of(65536L)) : packageManager.queryIntentActivities(intent2, 65536);
        AbstractC6118n.m27184b(listQueryIntentActivities);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            Intent intent3 = new Intent(intent);
            intent3.setPackage(str);
            arrayList.add(intent3);
        }
        if (arrayList.isEmpty()) {
            Intent intentCreateChooser = Intent.createChooser(intent, this.f20649a.getString(R.string.send_email_via));
            AbstractC6118n.m27184b(intentCreateChooser);
            return intentCreateChooser;
        }
        Intent intentCreateChooser2 = Intent.createChooser((Intent) arrayList.remove(0), this.f20649a.getString(R.string.send_email_via));
        if (!arrayList.isEmpty()) {
            intentCreateChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        }
        AbstractC6118n.m27184b(intentCreateChooser2);
        return intentCreateChooser2;
    }

    /* JADX INFO: renamed from: e */
    private final a m24594e() {
        String str;
        String str2 = "Android " + Build.VERSION.RELEASE;
        String str3 = Build.MANUFACTURER + ' ' + Build.MODEL;
        String language = Locale.getDefault().getLanguage();
        Object systemService = this.f20649a.getSystemService("uimode");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int nightMode = ((UiModeManager) systemService).getNightMode();
        if (nightMode != 1) {
            str = nightMode != 2 ? "Unknown Theme" : "Dark Theme";
        } else {
            str = "Light Theme";
        }
        String str4 = str;
        AbstractC6118n.m27184b(language);
        return new a("200.5.0", str2, str3, "com.anas_mugally.clipboard", str4, language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C1444v m24595g(C5425w c5425w, boolean z7, InterfaceC5367l interfaceC5367l, List filesToAttach) {
        Intent intent;
        AbstractC6118n.m27187e(filesToAttach, "filesToAttach");
        String strM24592c = c5425w.m24592c(c5425w.m24594e());
        StringBuilder sb = new StringBuilder();
        sb.append("App Feedback or Issue Report with Crash Logs ");
        sb.append(z7 ? "- Premium User" : "");
        String string = sb.toString();
        if (filesToAttach.isEmpty()) {
            Uri uri = Uri.parse("mailto:support@clipzboard.com?subject=" + Uri.encode(string) + "&body=" + Uri.encode(strM24592c));
            intent = new Intent("android.intent.action.SENDTO");
            intent.setData(uri);
        } else {
            Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
            intent2.setType("message/rfc822");
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{"support@clipzboard.com"});
            intent2.putExtra("android.intent.extra.SUBJECT", string);
            intent2.putExtra("android.intent.extra.TEXT", strM24592c);
            c5425w.m24591b(intent2, filesToAttach);
            intent = intent2;
        }
        try {
            c5425w.f20649a.startActivity(c5425w.m24593d(intent));
        } catch (ActivityNotFoundException unused) {
            String string2 = c5425w.f20649a.getString(R.string.error_open_app);
            AbstractC6118n.m27186d(string2, "getString(...)");
            Toast.makeText(c5425w.f20649a, string2, 0).show();
            if (interfaceC5367l != null) {
                interfaceC5367l.invoke(string2);
            }
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: f */
    public final void m24596f(final boolean z7, final InterfaceC5367l interfaceC5367l) {
        C3069s.f12637a.m15186g(this.f20649a, 25, new InterfaceC5367l() { // from class: f1.v
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C5425w.m24595g(this.f20646a, z7, interfaceC5367l, (List) obj);
            }
        });
    }
}
