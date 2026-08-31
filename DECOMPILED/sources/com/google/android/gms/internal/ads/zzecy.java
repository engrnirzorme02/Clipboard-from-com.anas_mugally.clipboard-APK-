package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.AbstractC2379b;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3452Q;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import p017C.AbstractC0111l;
import p017C.C0114o;
import p364u2.AbstractC7156b;
import p364u2.AbstractC7157c;
import p364u2.AbstractC7158d;
import p380w2.C7351t;
import p388x2.C7403a;
import p396y2.AbstractBinderC7534v;
import p404z2.AbstractC7599p;
import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecy extends zzbso {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsm zzc;
    private final C7605v zzd;
    private final zzecn zze;
    private String zzf;
    private String zzg;

    public zzecy(Context context, zzecn zzecnVar, C7605v c7605v, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zzc = zzdsmVar;
        this.zzd = c7605v;
        this.zze = zzecnVar;
    }

    public static void zzd(Context context, zzdsm zzdsmVar, zzecn zzecnVar, String str, String str2) {
        zzk(context, zzdsmVar, zzecnVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdsm zzdsmVar, zzecn zzecnVar, String str, String str2, Map map) {
        String strZzg;
        String str3 = true != C7351t.m32354l().zzs(context) ? "offline" : AbstractC2379b.ONLINE_EXTRAS_KEY;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzc("gqi", str);
            zzdslVarZza.zzc("action", str2);
            zzdslVarZza.zzc("device_connectivity", str3);
            zzdslVarZza.zzc("event_timestamp", String.valueOf(C7351t.m32357o().mo18159a()));
            for (Map.Entry entry : map.entrySet()) {
                zzdslVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdslVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzecnVar.zze(new zzecp(C7351t.m32357o().mo18159a(), str, strZzg, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzgec.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzgec.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, final AbstractBinderC7534v abstractBinderC7534v) {
        C7351t.m32349g();
        if (C0114o.m540b(activity).m544a()) {
            zzt();
            zzu(activity, abstractBinderC7534v);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgkc.zza());
                return;
            }
            C7351t.m32349g();
            AlertDialog.Builder builderM17424o = C3431F0.m17424o(activity);
            builderM17424o.setTitle(zzx(AbstractC7158d.f28591f, "Allow app to send you notifications?")).setPositiveButton(zzx(AbstractC7158d.f28589d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzect
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                    this.zza.zzo(activity, abstractBinderC7534v, dialogInterface, i7);
                }
            }).setNegativeButton(zzx(AbstractC7158d.f28590e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecu
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                    this.zza.zzp(abstractBinderC7534v, dialogInterface, i7);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecv
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(abstractBinderC7534v, dialogInterface);
                }
            });
            builderM17424o.create().show();
            zzw(this.zzf, "rtsdi", zzgkc.zza());
        }
    }

    private final void zzt() {
        boolean zZzg;
        boolean zZze;
        try {
            C7351t.m32349g();
            Context context = this.zzb;
            InterfaceC3452Q interfaceC3452QM17406d = C3431F0.m17406d(context);
            InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzecf zzecfVar = (zzecf) this.zza.get(str2);
            zZzg = interfaceC3452QM17406d.zzg(interfaceC3772aM18221N0, new C7403a(str, str2, zzecfVar == null ? "" : zzecfVar.zzb()));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = interfaceC3452QM17406d.zze(BinderC3773b.m18221N0(context), this.zzg, this.zzf);
                } catch (RemoteException e7) {
                    e = e7;
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e8) {
            e = e8;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.zze.zzd(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgkc.zza());
    }

    private final void zzu(Activity activity, AbstractBinderC7534v abstractBinderC7534v) {
        AlertDialog alertDialogZzv = zzv(activity, abstractBinderC7534v);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzecq(this, alertDialogZzv, timer, abstractBinderC7534v), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final AbstractBinderC7534v abstractBinderC7534v) {
        C7351t.m32349g();
        AlertDialog.Builder onCancelListener = C3431F0.m17424o(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                AbstractBinderC7534v abstractBinderC7534v2 = abstractBinderC7534v;
                if (abstractBinderC7534v2 != null) {
                    abstractBinderC7534v2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(AbstractC7157c.f28585a);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(AbstractC7158d.f28592g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(AbstractC7156b.f28583a);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzecf zzecfVar = (zzecf) this.zza.get(this.zzf);
            Drawable drawableZzc = zzecfVar != null ? zzecfVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(AbstractC7156b.f28584b)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(AbstractC7158d.f28592g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i7, String str) {
        Resources resourcesZzf = C7351t.m32354l().zzf();
        if (resourcesZzf != null) {
            try {
                return resourcesZzf.getString(i7);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    private static XmlResourceParser zzy(int i7) {
        Resources resourcesZzf = C7351t.m32354l().zzf();
        if (resourcesZzf == null) {
            return null;
        }
        try {
            return resourcesZzf.getLayout(i7);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzecf zzecfVar = (zzecf) this.zza.get(this.zzf);
        return zzecfVar == null ? "" : zzecfVar.zza();
    }

    public final void zzc(String str, zzdiu zzdiuVar) {
        String strZzQ = zzdiuVar.zzQ();
        String strZzB = zzdiuVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbfw zzbfwVarZzD = zzdiuVar.zzD();
        if (zzbfwVarZzD != null) {
            try {
                string = zzbfwVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfw zzbfwVarZzP = zzdiuVar.zzP();
        Drawable drawable = null;
        if (zzbfwVarZzP != null) {
            try {
                InterfaceC3772a interfaceC3772aZzb = zzbfwVarZzP.zzb();
                if (interfaceC3772aZzb != null) {
                    drawable = (Drawable) BinderC3773b.m18220M0(interfaceC3772aZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzecc(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzs = C7351t.m32354l().zzs(context);
                HashMap map = new HashMap();
                char c7 = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c7 = true == zZzs ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c7 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzecn.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e7) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e7.toString());
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(InterfaceC3772a interfaceC3772a, String str, String str2) {
        zzj(interfaceC3772a, new C7403a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg() {
        final C7605v c7605v = this.zzd;
        this.zze.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzecl
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzecn.zzf(c7605v, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzh(InterfaceC3772a interfaceC3772a) {
        zzeda zzedaVar = (zzeda) BinderC3773b.m18220M0(interfaceC3772a);
        final Activity activityZza = zzedaVar.zza();
        final AbstractBinderC7534v abstractBinderC7534vZzb = zzedaVar.zzb();
        this.zzf = zzedaVar.zzc();
        this.zzg = zzedaVar.zzd();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjj)).booleanValue()) {
            zzs(activityZza, abstractBinderC7534vZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgkc.zza());
        C7351t.m32349g();
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(activityZza);
        builderM17424o.setTitle(zzx(AbstractC7158d.f28598m, "Open ad when you're back online.")).setMessage(zzx(AbstractC7158d.f28597l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(AbstractC7158d.f28595j, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                this.zza.zzl(activityZza, abstractBinderC7534vZzb, dialogInterface, i7);
            }
        }).setNegativeButton(zzx(AbstractC7158d.f28596k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                this.zza.zzm(abstractBinderC7534vZzb, dialogInterface, i7);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(abstractBinderC7534vZzb, dialogInterface);
            }
        });
        builderM17424o.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzi(String[] strArr, int[] iArr, InterfaceC3772a interfaceC3772a) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeda zzedaVar = (zzeda) BinderC3773b.m18220M0(interfaceC3772a);
                Activity activityZza = zzedaVar.zza();
                AbstractBinderC7534v abstractBinderC7534vZzb = zzedaVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i7] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, abstractBinderC7534vZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (abstractBinderC7534vZzb != null) {
                        abstractBinderC7534vZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzj(InterfaceC3772a interfaceC3772a, C7403a c7403a) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        String str2 = c7403a.f29650a;
        String str3 = c7403a.f29651b;
        String str4 = c7403a.f29652c;
        String strZzz = zzz();
        C7351t.m32352j().mo17461f(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        AbstractC0111l.e eVar = new AbstractC0111l.e(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzz)) {
            eVar.m470j(zzx(AbstractC7158d.f28593h, "You are back online! Let's pick up where we left off"));
        } else {
            eVar.m470j(String.format(zzx(AbstractC7158d.f28594i, "You are back online! Continue learning about %s"), strZzz));
        }
        eVar.m465e(true).m474n(pendingIntentZzr2).m468h(pendingIntentZzr).m482w(context.getApplicationInfo().icon).m480u(((Integer) C3250D.m17200c().zzd(zzbci.zzjk)).intValue());
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjm)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                eVar.m475p(bitmapDecodeStream).m484y(new AbstractC0111l.b().m447i(bitmapDecodeStream).m446h(null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, eVar.m463b());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e7) {
            map.put("notification_not_shown_reason", e7.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    final /* synthetic */ void zzl(Activity activity, AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface, int i7) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", map);
        zzs(activity, abstractBinderC7534v);
    }

    final /* synthetic */ void zzm(AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface, int i7) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }

    final /* synthetic */ void zzn(AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }

    final /* synthetic */ void zzo(Activity activity, AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface, int i7) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", map);
        activity.startActivity(C7351t.m32352j().mo17463h(activity));
        zzt();
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }

    final /* synthetic */ void zzp(AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface, int i7) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }

    final /* synthetic */ void zzq(AbstractBinderC7534v abstractBinderC7534v, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }
}
