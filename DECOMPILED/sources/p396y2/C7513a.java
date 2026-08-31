package p396y2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzdsm;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7513a {
    /* JADX INFO: renamed from: a */
    public static final boolean m33152a(Context context, Intent intent, InterfaceC7516d interfaceC7516d, InterfaceC7512G interfaceC7512G, boolean z7, zzdsm zzdsmVar, String str) {
        if (z7) {
            return m33154c(context, intent.getData(), interfaceC7516d, interfaceC7512G);
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            AbstractC3490o0.m17545k(sb.toString());
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznU)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17388D(context, intent, zzdsmVar, str);
            } else {
                C7351t.m32349g();
                C3431F0.m17434y(context, intent);
            }
            if (interfaceC7516d != null) {
                interfaceC7516d.zzl();
            }
            if (interfaceC7512G != null) {
                interfaceC7512G.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e7) {
            String message = e7.getMessage();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(message);
            if (interfaceC7512G != null) {
                interfaceC7512G.zza(false);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m33153b(Context context, C7524l c7524l, InterfaceC7516d interfaceC7516d, InterfaceC7512G interfaceC7512G, zzdsm zzdsmVar, String str) {
        int i7 = 0;
        if (c7524l == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("No intent data for launcher overlay.");
            return false;
        }
        zzbci.zza(context);
        Intent intent = c7524l.f30134s;
        if (intent != null) {
            return m33152a(context, intent, interfaceC7516d, interfaceC7512G, c7524l.f30136u, zzdsmVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = c7524l.f30128b;
        if (TextUtils.isEmpty(str2)) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = c7524l.f30129c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = c7524l.f30130d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = c7524l.f30131e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i10 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = c7524l.f30132f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i7 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Could not parse intent flags.");
            }
            intent2.addFlags(i7);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfa)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeZ)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17405c0(context, intent2);
            }
        }
        return m33152a(context, intent2, interfaceC7516d, interfaceC7512G, c7524l.f30136u, zzdsmVar, str);
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m33154c(Context context, Uri uri, InterfaceC7516d interfaceC7516d, InterfaceC7512G interfaceC7512G) {
        int iM17446Z;
        try {
            iM17446Z = C7351t.m32349g().m17446Z(context, uri);
            if (interfaceC7516d != null) {
                interfaceC7516d.zzl();
            }
        } catch (ActivityNotFoundException e7) {
            String message = e7.getMessage();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(message);
            iM17446Z = 6;
        }
        if (interfaceC7512G != null) {
            interfaceC7512G.zzb(iM17446Z);
        }
        return iM17446Z == 5;
    }
}
