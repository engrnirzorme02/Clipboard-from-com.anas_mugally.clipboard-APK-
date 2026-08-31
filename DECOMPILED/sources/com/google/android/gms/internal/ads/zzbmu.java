package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmu implements zzbjl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbno zzb;
    final /* synthetic */ zzbmk zzc;
    final /* synthetic */ zzbnp zzd;

    zzbmu(zzbnp zzbnpVar, long j7, zzbno zzbnoVar, zzbmk zzbmkVar) {
        this.zza = j7;
        this.zzb = zzbnoVar;
        this.zzc = zzbmkVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzd = zzbnpVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jMo18159a = C7351t.m32357o().mo18159a() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(jMo18159a).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jMo18159a);
        sb.append(" ms.");
        AbstractC3490o0.m17545k(sb.toString());
        AbstractC3490o0.m17545k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbnp zzbnpVar = this.zzd;
        synchronized (zzbnpVar.zzf()) {
            AbstractC3490o0.m17545k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbno zzbnoVar = this.zzb;
            if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                zzbnpVar.zzk(0);
                zzbmk zzbmkVar = this.zzc;
                zzbmkVar.zzm("/log", zzbjk.zzg);
                zzbmkVar.zzm("/result", zzbjk.zzo);
                zzbnoVar.zzf(zzbmkVar);
                zzbnpVar.zzi(zzbnoVar);
                AbstractC3490o0.m17545k("Successfully loaded JS Engine.");
                AbstractC3490o0.m17545k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            AbstractC3490o0.m17545k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
