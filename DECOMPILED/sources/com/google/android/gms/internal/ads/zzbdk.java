package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.browser.customtabs.AbstractC2379b;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p036E2.AbstractC0335c;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdk extends AbstractC2379b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzkI)).split(","));
    private final zzbdn zzc;
    private final AbstractC2379b zzd;
    private final zzdsr zze;

    zzbdk(zzbdn zzbdnVar, AbstractC2379b abstractC2379b, zzdsr zzdsrVar) {
        this.zzd = abstractC2379b;
        this.zzc = zzbdnVar;
        this.zze = zzdsrVar;
    }

    private final void zzb(String str) {
        AbstractC0335c.m1523e(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void extraCallback(String str, Bundle bundle) {
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            return abstractC2379b.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onActivityResized(int i7, int i8, Bundle bundle) {
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.onActivityResized(i7, i8, bundle);
        }
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onNavigationEvent(int i7, Bundle bundle) {
        this.zza.set(false);
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.onNavigationEvent(i7, bundle);
        }
        zzbdn zzbdnVar = this.zzc;
        zzbdnVar.zzg(C7351t.m32357o().mo18159a());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i7))) {
            return;
        }
        zzbdnVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e7) {
            AbstractC3490o0.m17546l("Message is not in JSON format: ", e7);
        }
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onRelationshipValidationResult(int i7, Uri uri, boolean z7, Bundle bundle) {
        AbstractC2379b abstractC2379b = this.zzd;
        if (abstractC2379b != null) {
            abstractC2379b.onRelationshipValidationResult(i7, uri, z7, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
