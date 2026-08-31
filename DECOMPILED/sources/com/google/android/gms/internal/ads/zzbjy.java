package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.AbstractC2380c;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3452Q;
import com.google.android.gms.dynamic.BinderC3773b;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p017C.C0114o;
import p380w2.C7333b;
import p380w2.C7351t;
import p396y2.C7524l;
import p396y2.InterfaceC7512G;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7607x;
import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjy implements zzbjl {
    private final C7333b zza;
    private final zzdsm zzb;
    private final zzbrv zzd;
    private final zzecn zze;
    private final zzcmi zzf;
    private final zzcur zzg;
    private C7605v zzc = null;
    private InterfaceC7512G zzh = null;
    private final zzgpd zzi = zzbzh.zzg;

    public zzbjy(C7333b c7333b, zzbrv zzbrvVar, zzecn zzecnVar, zzdsm zzdsmVar, zzcmi zzcmiVar, zzcur zzcurVar) {
        this.zza = c7333b;
        this.zzd = zzbrvVar;
        this.zze = zzecnVar;
        this.zzb = zzdsmVar;
        this.zzf = zzcmiVar;
        this.zzg = zzcurVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzd(Context context, zzauu zzauuVar, Uri uri, View view, Activity activity, zzfdg zzfdgVar) {
        if (zzauuVar != null) {
            try {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmN)).booleanValue() || zzfdgVar == null) {
                    if (zzauuVar.zze(uri)) {
                        return zzauuVar.zzd(uri, context, view, activity);
                    }
                } else if (zzauuVar.zze(uri)) {
                    return zzfdgVar.zza(uri, context, view, activity);
                }
            } catch (zzauv unused) {
            } catch (Exception e7) {
                C7351t.m32354l().zzg(e7, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e7) {
            String strValueOf = String.valueOf(uri.toString());
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error adding click uptime parameter to url: ".concat(strValueOf), e7);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:119:0x02f5  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, InterfaceC3318a interfaceC3318a, Map map, String str2) {
        String str3;
        boolean zZzb;
        zzcur zzcurVar;
        Map map2 = map;
        zzcek zzcekVar = (zzcek) interfaceC3318a;
        zzfcj zzfcjVarZzC = zzcekVar.zzC();
        zzfcm zzfcmVarZzaC = zzcekVar.zzaC();
        boolean zZza = false;
        if (zzfcjVarZzC == null || zzfcmVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            str3 = zzfcmVarZzaC.zzb;
            zZzb = zzfcjVarZzC.zzb();
        }
        boolean z7 = (((Boolean) C3250D.m17200c().zzd(zzbci.zzlz)).booleanValue() && map2.containsKey("sc") && ((String) map2.get("sc")).equals("0")) ? false : true;
        boolean z8 = ((Boolean) C3250D.m17200c().zzd(zzbci.zznB)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcekVar.zzW()) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzcga) interfaceC3318a).zzaI(zzb(map2), zzc(map2), z7);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z9 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzmJ)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcga) interfaceC3318a).zzaJ(zzb(map2), zzc(map2), str, z7, z9);
                return;
            } else {
                ((zzcga) interfaceC3318a).zzaK(zzb(map2), zzc(map2), (String) map2.get("html"), (String) map2.get("baseurl"), z7);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcekVar.getContext();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfi)).booleanValue()) {
                AbstractC3490o0.m17545k("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfd)).booleanValue()) {
                    String strM10185c = AbstractC2380c.m10185c(context, null);
                    if (strM10185c != null && !context.getPackageName().equals(strM10185c)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbdj.zza(context);
                }
                if (zZza) {
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), Uri.parse(str), zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT()));
                    if (zZzb && this.zze != null && zzi(interfaceC3318a, zzcekVar.getContext(), uriZze.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbjv(this);
                    ((zzcga) interfaceC3318a).zzaH(new C7524l(null, uriZze.toString(), null, null, null, null, null, null, BinderC3773b.m18221N0(this.zzh).asBinder(), true), z7, z8, str3);
                    return;
                }
                zzg(4);
            }
            map2.put("use_first_package", "true");
            map2.put("use_running_process", "true");
            zzk(interfaceC3318a, map2, zZzb, str3, z7, z8);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
            zzk(interfaceC3318a, map2, zZzb, str3, z7, z8);
            return;
        }
        boolean z10 = z7;
        boolean z11 = zZzb;
        InterfaceC3318a interfaceC3318a2 = interfaceC3318a;
        boolean z12 = z8;
        String str4 = str3;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziX)).booleanValue()) {
                zzl(true);
                String str5 = (String) map2.get("p");
                if (str5 == null) {
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Package name missing from open app action.");
                    return;
                }
                if (z11 && this.zze != null && zzi(interfaceC3318a2, zzcekVar.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = zzcekVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcga) interfaceC3318a2).zzaH(new C7524l(launchIntentForPackage, this.zzh), z10, z12, str4);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str6 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e7) {
                String strValueOf = String.valueOf(str6);
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error parsing the url: ".concat(strValueOf), e7);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), data, zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriZze2);
                } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zziY)).booleanValue()) {
                    uri.setDataAndType(uriZze2, uri.getType());
                } else {
                    uri.setData(uriZze2);
                }
            }
        }
        boolean z13 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzjt)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznG)).booleanValue() && (zzcurVar = this.zzg) != null) {
            zzcurVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z13) {
            zzbjw zzbjwVar = new zzbjw(this, z10, interfaceC3318a2, map3, map2);
            interfaceC3318a2 = interfaceC3318a2;
            map2 = map2;
            this.zzh = zzbjwVar;
        } else {
            zZza = z10;
        }
        if (uri != null) {
            if (!z11 || this.zze == null || !zzi(interfaceC3318a2, zzcekVar.getContext(), uri.getData().toString(), str4)) {
                ((zzcga) interfaceC3318a2).zzaH(new C7524l(uri, this.zzh), zZza, z12, str4);
                return;
            } else {
                if (z13) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbmh) interfaceC3318a2).zze("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string = !TextUtils.isEmpty(str) ? zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), Uri.parse(str), zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT())).toString() : str;
        if (!z11 || this.zze == null || !zzi(interfaceC3318a2, zzcekVar.getContext(), string, str4)) {
            ((zzcga) interfaceC3318a2).zzaH(new C7524l((String) map2.get("i"), string, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzh), zZza, z12, str4);
        } else if (z13) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((zzbmh) interfaceC3318a2).zze("openIntentAsync", map3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.C3250D.m17200c().zzd(com.google.android.gms.internal.ads.zzbci.zzjn)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.C3250D.m17200c().zzd(com.google.android.gms.internal.ads.zzbci.zzji)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.C3250D.m17200c().zzd(com.google.android.gms.internal.ads.zzbci.zzjh)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(InterfaceC3318a interfaceC3318a, Context context, String str, String str2) {
        zzbtc zzbtcVar;
        AbstractC7607x abstractC7607x;
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzecy.zzd(context, zzdsmVar, this.zze, str2, "offline_open");
        }
        if (C7351t.m32354l().zzs(context)) {
            if (this.zzc == null) {
                this.zzc = new C7605v(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        zzcek zzcekVar = (zzcek) interfaceC3318a;
        zzfcj zzfcjVarZzC = zzcekVar.zzC();
        boolean z7 = (zzfcjVarZzC == null || (abstractC7607x = zzfcjVarZzC.zzay) == null || abstractC7607x.mo33321c()) ? false : true;
        boolean z8 = (zzfcjVarZzC == null || (zzbtcVar = zzfcjVarZzC.zzad) == null || !zzbtcVar.zza || zzbtcVar.zzb == null || !zzbtcVar.zzc) ? false : true;
        if (!z7) {
            if (z8) {
            }
            C7351t.m32349g();
            InterfaceC3452Q interfaceC3452QM17406d = C3431F0.m17406d(context);
            C7351t.m32349g();
            boolean zM544a = C0114o.m540b(context).m544a();
            boolean zMo17462g = C7351t.m32352j().mo17462g(context, "offline_notification_channel");
            boolean z9 = zzcekVar.zzN().zzg() && zzcekVar.zzj() == null;
            if (!zM544a) {
                C7351t.m32349g();
                if (!C0114o.m540b(context).m544a()) {
                }
                zzj(context, str2, "notifications_disabled");
                return false;
            }
            if (zMo17462g) {
                zzj(context, str2, "notification_channel_disabled");
                return false;
            }
            if (interfaceC3452QM17406d == null) {
                zzj(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z9) {
                zzj(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjf)).booleanValue()) {
                zzj(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcekVar.zzL() == null || zzcekVar.zzj() == null) {
                ((zzcga) interfaceC3318a).zzaL(str2, str, 14);
            } else {
                zzecz zzeczVarZze = zzeda.zze();
                zzeczVarZze.zza(zzcekVar.zzj());
                zzeczVarZze.zzb(null);
                zzeczVarZze.zzc(str2);
                zzeczVarZze.zzd(str);
                try {
                    zzcekVar.zzL().m33162O0(zzeczVarZze.zze());
                } catch (Exception e7) {
                    zzj(context, str2, e7.getMessage());
                    return false;
                }
            }
            interfaceC3318a.onAdClicked();
            return true;
        }
        zzdsm zzdsmVar2 = this.zzb;
        if (zzdsmVar2 != null) {
            zzecy.zzd(context, zzdsmVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzj(Context context, String str, String str2) {
        zzecn zzecnVar = this.zze;
        zzecnVar.zzd(str);
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzecy.zzk(context, zzdsmVar, zzecnVar, str, "dialog_not_shown", zzgkc.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:15:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155 A[PHI: r5
      0x0155: PHI (r5v2 com.google.android.gms.internal.ads.zzcek) = 
      (r5v1 com.google.android.gms.internal.ads.zzcek)
      (r5v1 com.google.android.gms.internal.ads.zzcek)
      (r5v1 com.google.android.gms.internal.ads.zzcek)
      (r5v3 com.google.android.gms.internal.ads.zzcek)
     binds: [B:35:0x0110, B:36:0x0112, B:38:0x0118, B:68:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    private final void zzk(InterfaceC3318a interfaceC3318a, Map map, boolean z7, String str, boolean z8, boolean z9) {
        boolean z10;
        Uri uriBuild;
        ArrayList arrayList;
        Intent intentZza;
        Intent intentZza2;
        ResolveInfo resolveInfoZzc;
        zzcek zzcekVar;
        Intent intentZzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        zzl(true);
        zzcek zzcekVar2 = (zzcek) interfaceC3318a;
        Context context = zzcekVar2.getContext();
        zzauu zzauuVarZzS = zzcekVar2.zzS();
        View viewZzE = zzcekVar2.zzE();
        zzfdg zzfdgVarZzT = zzcekVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzcekVar = zzcekVar2;
            intentZzd = null;
        } else {
            Uri uriZze = zze(zzd(context, zzauuVarZzS, Uri.parse(str2), viewZzE, null, zzfdgVarZzT));
            boolean z11 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z12 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzeZ)).booleanValue()) {
                    z10 = false;
                }
                if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                    uriBuild = uriZze.buildUpon().scheme("https").build();
                } else if ("https".equalsIgnoreCase(uriZze.getScheme())) {
                    uriBuild = uriZze.buildUpon().scheme("http").build();
                } else {
                    uriBuild = null;
                }
                arrayList = new ArrayList();
                intentZza = zzbjx.zza(uriZze, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                intentZza2 = zzbjx.zza(uriBuild, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                if (z10) {
                    C7351t.m32349g();
                    C3431F0.m17405c0(context, intentZza);
                    C7351t.m32349g();
                    C3431F0.m17405c0(context, intentZza2);
                }
                resolveInfoZzc = zzbjx.zzc(intentZza, arrayList, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                if (resolveInfoZzc != null) {
                    intentZzd = zzbjx.zzd(intentZza, resolveInfoZzc, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                } else {
                    if (intentZza2 != null && (resolveInfoZzb = zzbjx.zzb(intentZza2, context, zzauuVarZzS, viewZzE, zzfdgVarZzT)) != null) {
                        intentZzd = zzbjx.zzd(intentZza, resolveInfoZzb, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                        if (zzbjx.zzb(intentZzd, context, zzauuVarZzS, viewZzE, zzfdgVarZzT) == null) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        zzcekVar = zzcekVar2;
                    } else if (z12 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        zzcekVar = zzcekVar2;
                        if (z11) {
                            intentZzd = zzbjx.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                        }
                    } else {
                        int size = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size) {
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i7);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i8 = i7 + 1;
                                    if (it.hasNext()) {
                                        zzcekVar = zzcekVar2;
                                        if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                            intentZzd = zzbjx.zzd(intentZza, resolveInfo, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                                        } else {
                                            zzcekVar2 = zzcekVar;
                                        }
                                    } else {
                                        i7 = i8;
                                    }
                                }
                            } else {
                                zzcekVar = zzcekVar2;
                                if (z11) {
                                    intentZzd = zzbjx.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                                }
                            }
                        }
                    }
                    intentZzd = intentZza;
                }
                zzcekVar = zzcekVar2;
            }
            z10 = true;
            if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                uriBuild = uriZze.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZze.getScheme())) {
                uriBuild = uriZze.buildUpon().scheme("http").build();
            } else {
                uriBuild = null;
            }
            arrayList = new ArrayList();
            intentZza = zzbjx.zza(uriZze, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
            intentZza2 = zzbjx.zza(uriBuild, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
            if (z10) {
                C7351t.m32349g();
                C3431F0.m17405c0(context, intentZza);
                C7351t.m32349g();
                C3431F0.m17405c0(context, intentZza2);
            }
            resolveInfoZzc = zzbjx.zzc(intentZza, arrayList, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
            if (resolveInfoZzc != null) {
                intentZzd = zzbjx.zzd(intentZza, resolveInfoZzc, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
            } else {
                if (intentZza2 != null) {
                    intentZzd = zzbjx.zzd(intentZza, resolveInfoZzb, context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                    if (zzbjx.zzb(intentZzd, context, zzauuVarZzS, viewZzE, zzfdgVarZzT) == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    zzcekVar = zzcekVar2;
                } else if (z12) {
                    zzcekVar = zzcekVar2;
                    if (z11) {
                        intentZzd = zzbjx.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                    }
                } else {
                    zzcekVar = zzcekVar2;
                    if (z11) {
                        intentZzd = zzbjx.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzauuVarZzS, viewZzE, zzfdgVarZzT);
                    }
                }
                intentZzd = intentZza;
            }
            zzcekVar = zzcekVar2;
        }
        if (!z7 || this.zze == null || intentZzd == null || !zzi(interfaceC3318a, zzcekVar.getContext(), intentZzd.getData().toString(), str)) {
            try {
                ((zzcga) interfaceC3318a).zzaH(new C7524l(intentZzd, this.zzh), z8, z9, str);
            } catch (ActivityNotFoundException e7) {
                String message = e7.getMessage();
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(message);
            }
        }
    }

    private final void zzl(boolean z7) {
        zzbrv zzbrvVar = this.zzd;
        if (zzbrvVar != null) {
            zzbrvVar.zzb(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i7) {
        zzdsm zzdsmVar;
        String str;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfc)).booleanValue() || (zzdsmVar = this.zzb) == null) {
            return;
        }
        zzdsl zzdslVarZza = zzdsmVar.zza();
        zzdslVarZza.zzc("action", "cct_action");
        switch (i7) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdslVarZza.zzc("cct_open_status", str);
        zzdslVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmi zzcmiVar;
        InterfaceC3318a interfaceC3318a = (InterfaceC3318a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcek zzcekVar = (zzcek) interfaceC3318a;
        if (zzcekVar.zzC() != null) {
            map2 = zzcekVar.zzC().zzaw;
        }
        String strZza = zzbxt.zza(str, zzcekVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Action missing from an open GMSG.");
            return;
        }
        C7333b c7333b = this.zza;
        if (c7333b == null || c7333b.m32306b()) {
            zzgot.zzq((((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzf) != null && zzcmi.zzc(strZza)) ? zzcmiVar.zzb(strZza, C3244B.m17194e()) : zzgot.zza(strZza), new zzbju(this, map, interfaceC3318a, str2), this.zzi);
        } else {
            c7333b.m32307c(strZza);
        }
    }
}
