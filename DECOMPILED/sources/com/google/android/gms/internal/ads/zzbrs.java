package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Map;
import p364u2.AbstractC7158d;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrs extends zzbsb {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrs(zzcek zzcekVar, Map map) {
        super(zzcekVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        C7351t.m32349g();
        if (!new zzbbp(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        C7351t.m32349g();
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
        Resources resourcesZzf = C7351t.m32354l().zzf();
        builderM17424o.setTitle(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28603r) : "Create calendar event");
        builderM17424o.setMessage(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28604s) : "Allow Ad to create a calendar event?");
        builderM17424o.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28601p) : "Accept", new zzbrq(this));
        builderM17424o.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28602q) : "Decline", new zzbrr(this));
        builderM17424o.create().show();
    }

    final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j7 = this.zzd;
        if (j7 > -1) {
            data.putExtra("beginTime", j7);
        }
        long j8 = this.zze;
        if (j8 > -1) {
            data.putExtra("endTime", j8);
        }
        data.setFlags(268435456);
        return data;
    }

    final /* synthetic */ Context zzc() {
        return this.zzb;
    }
}
