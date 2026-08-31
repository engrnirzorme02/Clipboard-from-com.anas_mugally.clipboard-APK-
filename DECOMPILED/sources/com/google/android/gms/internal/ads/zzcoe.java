package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoe extends zzcqs {
    private final zzcek zzc;
    private final int zzd;
    private final Context zze;
    private final zzcns zzf;
    private final zzdgp zzg;
    private final zzddd zzh;
    private final zzcwf zzi;
    private final boolean zzj;
    private final zzbyz zzk;
    private final zzdsm zzl;
    private boolean zzm;

    zzcoe(zzcqr zzcqrVar, Context context, zzcek zzcekVar, int i7, zzcns zzcnsVar, zzdgp zzdgpVar, zzddd zzdddVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzm = false;
        this.zzc = zzcekVar;
        this.zze = context;
        this.zzd = i7;
        this.zzf = zzcnsVar;
        this.zzg = zzdgpVar;
        this.zzh = zzdddVar;
        this.zzi = zzcwfVar;
        this.zzj = ((Boolean) C3250D.m17200c().zzd(zzbci.zzfU)).booleanValue();
        this.zzk = zzbyzVar;
        this.zzl = zzdsmVar;
    }

    public final void zza(zzazv zzazvVar) {
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.zzay(zzazvVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzb(Activity activity, zzbai zzbaiVar, boolean z7) {
        zzcek zzcekVar;
        zzfcj zzfcjVarZzC;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        boolean z8 = this.zzj;
        if (z8) {
            this.zzh.zza();
        }
        C7351t.m32349g();
        zzdgp zzdgpVar = this.zzg;
        if (!C3431F0.m17428s(zzdgpVar.zzb())) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzom)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17427r(context, this.zzb, this.zzl);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaR)).booleanValue()) {
                C7351t.m32349g();
                if (C3431F0.m17420k(context)) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaS)).booleanValue()) {
                        new zzfor(context.getApplicationContext(), C7351t.m32365w().m17489a()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmI)).booleanValue() && (zzcekVar = this.zzc) != null && (zzfcjVarZzC = zzcekVar.zzC()) != null && zzfcjVarZzC.zzar && zzfcjVarZzC.zzas != this.zzk.zzj()) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("The app open consent form has been shown.");
            this.zzi.zzc(zzfee.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfee.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdgpVar.zza(z7, context, this.zzi);
            if (z8) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdgo e7) {
            this.zzi.zzd(e7);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzd() {
        super.zzd();
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.destroy();
        }
    }

    public final void zze(long j7, int i7) {
        this.zzf.zza(j7, i7);
    }
}
