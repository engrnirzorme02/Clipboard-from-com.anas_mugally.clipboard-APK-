package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONException;
import org.json.JSONObject;
import p170W2.AbstractC1845j;
import p227d3.C5228d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcd
                    @Override // com.google.android.gms.internal.ads.zzght
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:79:0x016a, B:80:0x0171, B:82:0x0173, B:83:0x017a, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:93:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015c A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    public final void zza(Context context) {
        SharedPreferences sharedPreferencesZzb;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        zzbds zzbdsVar;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = C5228d.m24155a(context).m24149c(this.zzg.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    Context contextM7632d = AbstractC1845j.m7632d(context2);
                    if (contextM7632d != null || context2 == null || (contextM7632d = context2.getApplicationContext()) != null) {
                        context2 = contextM7632d;
                    }
                    if (context2 != null) {
                        C3250D.m17198a();
                        sharedPreferencesZzb = zzbcb.zzb(context2);
                    } else {
                        sharedPreferencesZzb = null;
                    }
                    if (sharedPreferencesZzb != null) {
                        zzbfa.zzc(new zzbcc(this, sharedPreferencesZzb));
                    }
                    if (!this.zzi) {
                        zzbds zzbdsVar2 = zzbea.zzd;
                        if (((Long) zzbdsVar2.zze()).longValue() > 0 && zzbbt.zzd(this.zzg) >= ((Long) zzbdsVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        } else if (this.zzi) {
                            Context context3 = this.zzg;
                            if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                                if (((Boolean) zzbei.zzj.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbce
                                        @Override // com.google.android.gms.internal.ads.zzght
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    C3250D.m17198a();
                                    this.zze = zzbcb.zzb(context2);
                                    if (!this.zzi) {
                                        C3250D.m17201d().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                C3250D.m17198a();
                                this.zze = zzbcb.zzb(context2);
                                if (!this.zzi) {
                                    C3250D.m17201d().zza(this.zzg);
                                }
                                if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        } else {
                            zzbdsVar = zzbea.zzf;
                            if (((Long) zzbdsVar.zze()).longValue() > 0 || zzbbt.zzc(this.zzg) < ((Long) zzbdsVar.zze()).longValue()) {
                                Context context4 = this.zzg;
                                if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                                    if (((Boolean) zzbei.zzj.zze()).booleanValue() && (sharedPreferences = context4.getSharedPreferences("admob", 0)) != null) {
                                        try {
                                            if (new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbce
                                                @Override // com.google.android.gms.internal.ads.zzght
                                                public final /* synthetic */ Object zza() {
                                                    return sharedPreferences.getString("app_settings_json", "{}");
                                                }
                                            })).optBoolean("local_flags_enabled")) {
                                            }
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                    if (context2 == null) {
                                        C3250D.m17198a();
                                        this.zze = zzbcb.zzb(context2);
                                        if (!this.zzi && ((Boolean) zzbei.zzc.zze()).booleanValue()) {
                                            C3250D.m17201d().zza(this.zzg);
                                        }
                                        if (!((Boolean) zzbei.zzb.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                        }
                                        zzg(this.zze);
                                        this.zzd = true;
                                        this.zza = false;
                                        this.zzc.open();
                                        return;
                                    }
                                    this.zza = false;
                                    this.zzc.open();
                                }
                                context2 = this.zzg;
                                if (context2 == null) {
                                    C3250D.m17198a();
                                    this.zze = zzbcb.zzb(context2);
                                    if (!this.zzi) {
                                        C3250D.m17201d().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            } else {
                                this.zzj = true;
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                            }
                        }
                    } else if (this.zzi) {
                        zzbdsVar = zzbea.zzf;
                        if (((Long) zzbdsVar.zze()).longValue() > 0) {
                            Context context5 = this.zzg;
                            if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                                if (((Boolean) zzbei.zzj.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbce
                                        @Override // com.google.android.gms.internal.ads.zzght
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    C3250D.m17198a();
                                    this.zze = zzbcb.zzb(context2);
                                    if (!this.zzi) {
                                        C3250D.m17201d().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                C3250D.m17198a();
                                this.zze = zzbcb.zzb(context2);
                                if (!this.zzi) {
                                    C3250D.m17201d().zza(this.zzg);
                                }
                                if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        } else {
                            Context context6 = this.zzg;
                            if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                                if (((Boolean) zzbei.zzj.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbce
                                        @Override // com.google.android.gms.internal.ads.zzght
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", "{}");
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    C3250D.m17198a();
                                    this.zze = zzbcb.zzb(context2);
                                    if (!this.zzi) {
                                        C3250D.m17201d().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                C3250D.m17198a();
                                this.zze = zzbcb.zzb(context2);
                                if (!this.zzi) {
                                    C3250D.m17201d().zza(this.zzg);
                                }
                                if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                    } else {
                        Context context7 = this.zzg;
                        if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                            if (((Boolean) zzbei.zzj.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbce
                                    @Override // com.google.android.gms.internal.ads.zzght
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", "{}");
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                C3250D.m17198a();
                                this.zze = zzbcb.zzb(context2);
                                if (!this.zzi) {
                                    C3250D.m17201d().zza(this.zzg);
                                }
                                if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            C3250D.m17198a();
                            this.zze = zzbcb.zzb(context2);
                            if (!this.zzi) {
                                C3250D.m17201d().zza(this.zzg);
                            }
                            if (!((Boolean) zzbei.zzb.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    }
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbbz zzbbzVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbzVar.zzf();
            }
        }
        if (zzbbzVar.zzm() != 2) {
            return (zzbbzVar.zzm() == 1 && this.zzh.has(zzbbzVar.zze())) ? zzbbzVar.zzc(this.zzh) : zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcf
                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbbzVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbzVar.zzf() : zzbbzVar.zza(bundle);
    }

    public final Object zze(zzbbz zzbbzVar) {
        return (this.zzd || this.zza) ? zzd(zzbbzVar) : zzbbzVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbbz zzbbzVar) {
        return zzbbzVar.zzd(this.zze);
    }
}
