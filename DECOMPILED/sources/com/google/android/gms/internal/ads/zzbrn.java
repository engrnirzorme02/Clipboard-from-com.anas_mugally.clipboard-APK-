package com.google.android.gms.internal.ads;

import java.util.Objects;
import p396y2.InterfaceC7536x;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrn implements InterfaceC7536x {
    final /* synthetic */ zzbrp zza;

    zzbrn(zzbrp zzbrpVar) {
        Objects.requireNonNull(zzbrpVar);
        this.zza = zzbrpVar;
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
        AbstractC7599p.m33326a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is closed.");
        zzbrp zzbrpVar = this.zza;
        zzbrpVar.zzb().onAdClosed(zzbrpVar);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
        AbstractC7599p.m33326a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
        AbstractC7599p.m33326a("Opening AdMobCustomTabsAdapter overlay.");
        zzbrp zzbrpVar = this.zza;
        zzbrpVar.zzb().onAdOpened(zzbrpVar);
    }
}
