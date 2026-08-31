package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzfi;

/* JADX INFO: loaded from: classes2.dex */
public class zzfe<MessageType extends zzfi<MessageType, BuilderType>, BuilderType extends zzfe<MessageType, BuilderType>> extends zzdr<MessageType, BuilderType> {
    protected zzfi zza;
    private final zzfi zzb;

    protected zzfe(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzz()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzo();
    }

    private static void zza(Object obj, Object obj2) {
        zzgs.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdr
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzfe clone() {
        zzfe zzfeVar = (zzfe) this.zzb.zzb(5, null, null);
        zzfeVar.zza = zzg();
        return zzfeVar;
    }

    public final zzfe zzd(zzfi zzfiVar) {
        if (!this.zzb.equals(zzfiVar)) {
            if (!this.zza.zzz()) {
                zzj();
            }
            zza(this.zza, zzfiVar);
        }
        return this;
    }

    public final MessageType zze() {
        MessageType messagetype = (MessageType) zzg();
        if (messagetype.zzk()) {
            return messagetype;
        }
        throw new zzhg(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public MessageType zzg() {
        if (!this.zza.zzz()) {
            return (MessageType) this.zza;
        }
        this.zza.zzu();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* bridge */ /* synthetic */ zzgl zzh() {
        throw null;
    }

    protected final void zzi() {
        if (this.zza.zzz()) {
            return;
        }
        zzj();
    }

    protected void zzj() {
        zzfi zzfiVarZzo = this.zzb.zzo();
        zza(zzfiVarZzo, this.zza);
        this.zza = zzfiVarZzo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk() {
        return zzfi.zzA(this.zza, false);
    }
}
