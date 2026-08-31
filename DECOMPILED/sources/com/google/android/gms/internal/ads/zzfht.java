package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3451P0;
import java.util.Iterator;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfht implements zzfhr {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfig zzj = zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfht(Context context, int i7) {
        this.zza = context;
        this.zzp = i7;
    }

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ String zzE() {
        return this.zzf;
    }

    final /* synthetic */ String zzF() {
        return this.zzg;
    }

    final /* synthetic */ String zzG() {
        return this.zzh;
    }

    final /* synthetic */ String zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzfig zzI() {
        return this.zzj;
    }

    final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ String zzK() {
        return this.zzl;
    }

    final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfht zzM(int i7) {
        this.zzq = i7;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzd(boolean z7) {
        zzs(z7);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzf(zzfig zzfigVar) {
        zzu(zzfigVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzg(zzfct zzfctVar) {
        zzv(zzfctVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzh(C3324b1 c3324b1) {
        zzw(c3324b1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final synchronized zzfhu zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfhu(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final /* bridge */ /* synthetic */ zzfhr zzp(int i7) {
        zzM(i7);
        return this;
    }

    public final synchronized zzfht zzq() {
        Configuration configuration;
        AbstractC3451P0 abstractC3451P0M32352j = C7351t.m32352j();
        Context context = this.zza;
        this.zze = abstractC3451P0M32352j.mo17473k(context);
        Resources resources = context.getResources();
        int i7 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i7 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i7;
        this.zzb = C7351t.m32357o().mo18161c();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfht zzr() {
        this.zzc = C7351t.m32357o().mo18161c();
        return this;
    }

    public final synchronized zzfht zzs(boolean z7) {
        this.zzd = z7;
        return this;
    }

    public final synchronized zzfht zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfht zzu(zzfig zzfigVar) {
        this.zzj = zzfigVar;
        return this;
    }

    public final synchronized zzfht zzv(zzfct zzfctVar) {
        try {
            String str = zzfctVar.zzb.zzb;
            if (!TextUtils.isEmpty(str)) {
                this.zzf = str;
            }
            Iterator it = zzfctVar.zza.iterator();
            while (it.hasNext()) {
                String str2 = ((zzfcj) it.next()).zzab;
                if (!TextUtils.isEmpty(str2)) {
                    this.zzg = str2;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfht zzw(C3324b1 c3324b1) {
        try {
            IBinder iBinder = c3324b1.f13922e;
            if (iBinder != null) {
                zzcvl zzcvlVar = (zzcvl) iBinder;
                String strZzk = zzcvlVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzf = zzcvlVar.zzf();
                if (!TextUtils.isEmpty(strZzf)) {
                    this.zzg = strZzf;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfht zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfht zzy(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzl = zzbtt.zzf(th);
            this.zzk = (String) zzghq.zza(zzggo.zzc('\n')).zzd(zzbtt.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfht zzz(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjC)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
