package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3377o2;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.EnumC7604u;

/* JADX INFO: loaded from: classes2.dex */
final class zzfjt implements zzgoq {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzcyh zzc;
    final /* synthetic */ zzfjv zzd;

    zzfjt(zzfjv zzfjvVar, zzfhr zzfhrVar, zzfib zzfibVar, zzcyh zzcyhVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfibVar;
        this.zzc = zzcyhVar;
        Objects.requireNonNull(zzfjvVar);
        this.zzd = zzfjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zza;
        if (zzfhrVar == null) {
            return;
        }
        zzfhrVar.zzd(false);
        zzfib zzfibVar = this.zzb;
        if (zzfibVar != null) {
            zzfibVar.zza(zzfhrVar);
            zzfibVar.zzh();
        } else {
            zzfjv zzfjvVar = this.zzd;
            zzfjvVar.zze().zzb(zzfhrVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        byte b7;
        int i7;
        int i8;
        zzfhr zzfhrVar = this.zza;
        EnumC7604u enumC7604u = (EnumC7604u) obj;
        if (zzfhrVar != null) {
            zzfhrVar.zzd(enumC7604u == EnumC7604u.SUCCESS);
            zzfib zzfibVar = this.zzb;
            if (zzfibVar == null) {
                this.zzd.zze().zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zza(zzfhrVar);
                zzfibVar.zzh();
            }
        }
        zzcyh zzcyhVar = this.zzc;
        if (zzcyhVar != null) {
            String strM33343a = this.zzd.zzd().m33343a();
            if (TextUtils.isEmpty(strM33343a)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM33343a);
                Parcelable.Creator<C3377o2> creator = C3377o2.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode = strOptString.hashCode();
                byte b8 = -1;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            b7 = 2;
                        } else {
                            b7 = -1;
                        }
                    } else if (strOptString.equals("CPM")) {
                        b7 = 0;
                    } else {
                        b7 = -1;
                    }
                } else if (strOptString.equals("CPC")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
                if (b7 == 0) {
                    i7 = 1;
                } else if (b7 == 1) {
                    i7 = 2;
                } else if (b7 != 2) {
                    i7 = 0;
                } else {
                    jOptLong /= 1000;
                    i7 = 3;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            b8 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b8 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b8 = 0;
                }
                if (b8 == 0) {
                    i8 = 1;
                } else if (b8 != 1) {
                    i8 = b8 != 2 ? 0 : 3;
                } else {
                    i8 = 2;
                }
                zzcyhVar.zza(new C3377o2(i7, i8, strOptString3, jOptLong));
            } catch (JSONException e7) {
                C7351t.m32354l().zzg(e7, "UrlPinger.pingUrl");
            }
        }
    }
}
