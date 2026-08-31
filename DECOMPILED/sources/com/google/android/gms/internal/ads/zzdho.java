package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3260G0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.util.AbstractC3456V;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7333b;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdho implements zzdjc {
    private InterfaceC3260G0 zzC;
    private final zzcyh zzD;
    private final zzdjv zzE;
    private final C7333b zzF;
    private final zzcum zzG;
    private final Context zza;
    private final zzdje zzb;
    private final JSONObject zzc;
    private final zzdnx zzd;
    private final zzdiu zze;
    private final zzauu zzf;
    private final zzcwk zzg;
    private final zzcvq zzh;
    private final zzddx zzi;
    private final zzfcj zzj;
    private final C7584a zzk;
    private final zzfdc zzl;
    private final zzcnf zzm;
    private final zzdjz zzn;
    private final InterfaceC3750e zzo;
    private final zzddt zzp;
    private final zzfjv zzq;
    private final zzdpn zzr;
    private final zzfib zzs;
    private final zzecy zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdho(Context context, zzdje zzdjeVar, JSONObject jSONObject, zzdnx zzdnxVar, zzdiu zzdiuVar, zzauu zzauuVar, zzcwk zzcwkVar, zzcvq zzcvqVar, zzddx zzddxVar, zzfcj zzfcjVar, C7584a c7584a, zzfdc zzfdcVar, zzcnf zzcnfVar, zzdjz zzdjzVar, InterfaceC3750e interfaceC3750e, zzddt zzddtVar, zzfjv zzfjvVar, zzfib zzfibVar, zzecy zzecyVar, zzdpn zzdpnVar, zzdjv zzdjvVar, zzcyh zzcyhVar, C7333b c7333b, zzbxf zzbxfVar, zzcum zzcumVar) {
        this.zza = context;
        this.zzb = zzdjeVar;
        this.zzc = jSONObject;
        this.zzd = zzdnxVar;
        this.zze = zzdiuVar;
        this.zzf = zzauuVar;
        this.zzg = zzcwkVar;
        this.zzh = zzcvqVar;
        this.zzi = zzddxVar;
        this.zzj = zzfcjVar;
        this.zzk = c7584a;
        this.zzl = zzfdcVar;
        this.zzm = zzcnfVar;
        this.zzn = zzdjzVar;
        this.zzo = interfaceC3750e;
        this.zzp = zzddtVar;
        this.zzq = zzfjvVar;
        this.zzs = zzfibVar;
        this.zzt = zzecyVar;
        this.zzr = zzdpnVar;
        this.zzE = zzdjvVar;
        this.zzD = zzcyhVar;
        this.zzF = c7333b;
        this.zzG = zzcumVar;
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzx = this.zze.zzx();
        if (iZzx == 1) {
            return "1099";
        }
        if (iZzx == 2) {
            return "2099";
        }
        if (iZzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        C7333b c7333b;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoq)).booleanValue() || (c7333b = this.zzF) == null) {
            return;
        }
        c7333b.m32305a();
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z7, View view) {
        JSONException jSONException;
        zzcum zzcumVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdW)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e7) {
                    jSONException = e7;
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z7);
            jSONObject6.put("screen", AbstractC3456V.m17501j(this.zza));
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzos)).booleanValue() && (zzcumVar = this.zzG) != null && zzcumVar.zza() > 0) {
                jSONObject6.put("placement_id", zzcumVar.zza());
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjr)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdhl(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdhk(this, null));
            }
            zzdnx zzdnxVar = this.zzd;
            zzdnxVar.zzd("/nativeImpression", new zzdhm(this, view, null));
            try {
                zzdnxVar.zzd("/nativeImpressionFlowControl", new zzdhn(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzbzk.zza(zzdnxVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.zzu) {
                    return true;
                }
                this.zzu = C7351t.m32361s().m17592g(this.zza, this.zzk.f30226a, this.zzj.zzC.toString(), this.zzl.zzg);
                return true;
            } catch (JSONException e8) {
                e = e8;
                jSONException = e;
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e9) {
            e = e9;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdW)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzA() {
        this.zzd.zzb();
    }

    final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    final /* synthetic */ zzcwk zzC() {
        return this.zzg;
    }

    final /* synthetic */ zzcvq zzD() {
        return this.zzh;
    }

    final /* synthetic */ zzddx zzE() {
        return this.zzi;
    }

    final /* synthetic */ zzcyh zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zM17492a = AbstractC3456V.m17492a(this.zzk.f30228c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zM17492a) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zM17492a) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzc(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectM17496e = AbstractC3456V.m17496e(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM17493b = AbstractC3456V.m17493b(context, view2);
        JSONObject jSONObjectM17494c = AbstractC3456V.m17494c(view2);
        JSONObject jSONObjectM17495d = AbstractC3456V.m17495d(context, view2);
        String strZzH = zzH(view, map);
        zzi(true == ((Boolean) C3250D.m17200c().zzd(zzbci.zzed)).booleanValue() ? view2 : view, jSONObjectM17493b, jSONObjectM17496e, jSONObjectM17494c, jSONObjectM17495d, strZzH, AbstractC3456V.m17497f(strZzH, context, this.zzz, this.zzy), null, z7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zze(Bundle bundle) {
        if (bundle == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, C3244B.m17190a().m33297t(bundle, null), false, false);
        } else {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzf(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i7) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z8 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmp)).booleanValue()) {
                z8 = true;
            }
        }
        if (!z8) {
            if (!this.zzx) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectM17496e = AbstractC3456V.m17496e(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM17493b = AbstractC3456V.m17493b(context, view2);
        boolean z9 = z8;
        JSONObject jSONObjectM17494c = AbstractC3456V.m17494c(view2);
        JSONObject jSONObjectM17495d = AbstractC3456V.m17495d(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectM17497f = AbstractC3456V.m17497f(strZzH, context, this.zzz, this.zzy);
        if (z9) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i7);
                    } catch (Exception e7) {
                        e = e7;
                        int i10 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e8) {
                    e = e8;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e9) {
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error occurred while adding CustomClickGestureSignals to adJson.", e9);
                C7351t.m32354l().zzg(e9, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, jSONObjectM17493b, jSONObjectM17496e, jSONObjectM17494c, jSONObjectM17495d, strZzH, jSONObjectM17497f, null, z7, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzh() {
        return zzI();
    }

    protected final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z7, boolean z8) {
        String strZzg;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdje zzdjeVar = this.zzb;
            zzdiu zzdiuVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdjeVar.zzg(zzdiuVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdiuVar.zzx());
            jSONObject9.put("view_aware_api_used", z7);
            zzbfl zzbflVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbflVar != null && zzbflVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdiuVar.zzE().isEmpty() || zzdiuVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.mo18159a());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z8) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdjeVar.zzg(zzdiuVar.zzS()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.zzf.zzb().zzg(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Exception obtaining click signals", e7);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjv)).booleanValue() && AbstractC3760o.m18202j()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjw)).booleanValue() && AbstractC3760o.m18202j()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jMo18159a = this.zzo.mo18159a();
            jSONObject10.put("time_from_last_touch_down", jMo18159a - this.zzA);
            jSONObject10.put("time_from_last_touch", jMo18159a - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e8) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to create click JSON.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzy = AbstractC3456V.m17499h(motionEvent, view2);
        long jMo18159a = this.zzo.mo18159a();
        this.zzB = jMo18159a;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = jMo18159a;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzc(motionEventObtain);
        motionEventObtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectM17496e = AbstractC3456V.m17496e(context, map, map2, view, scaleType);
        JSONObject jSONObjectM17493b = AbstractC3456V.m17493b(context, view);
        JSONObject jSONObjectM17494c = AbstractC3456V.m17494c(view);
        JSONObject jSONObjectM17495d = AbstractC3456V.m17495d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectM17496e);
            jSONObject.put("ad_view_signal", jSONObjectM17493b);
            jSONObject.put("scroll_view_signal", jSONObjectM17494c);
            jSONObject.put("lock_screen_signal", jSONObjectM17495d);
            return jSONObject;
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to create native ad view signals JSON.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzl != null) {
                jSONObject.put("nas", jSONObjectZzl);
                return jSONObject;
            }
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to create native click meta data JSON.", e7);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjz zzdjzVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjzVar);
        view.setClickable(true);
        zzdjzVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzp(zzbhn zzbhnVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbhnVar);
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzr(InterfaceC3272K0 interfaceC3272K0) {
        try {
            if (this.zzw) {
                return;
            }
            if (interfaceC3272K0 == null) {
                zzdiu zzdiuVar = this.zze;
                if (zzdiuVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdiuVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(interfaceC3272K0.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzs(InterfaceC3260G0 interfaceC3260G0) {
        this.zzC = interfaceC3260G0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzt() {
        try {
            InterfaceC3260G0 interfaceC3260G0 = this.zzC;
            if (interfaceC3260G0 != null) {
                interfaceC3260G0.zze();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final int zzu() {
        zzbfl zzbflVar = this.zzl.zzj;
        if (zzbflVar == null) {
            return 0;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmp)).booleanValue()) {
            return zzbflVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmp)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzK(AbstractC3456V.m17493b(context, view), AbstractC3456V.m17496e(context, map, map2, view, scaleType), AbstractC3456V.m17494c(view), AbstractC3456V.m17495d(context, view), zzL(view), null, AbstractC3456V.m17500i(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectM17496e = AbstractC3456V.m17496e(context, map, map2, view, scaleType);
        JSONObject jSONObjectM17493b = AbstractC3456V.m17493b(context, view);
        JSONObject jSONObjectM17494c = AbstractC3456V.m17494c(view);
        JSONObject jSONObjectM17495d = AbstractC3456V.m17495d(context, view);
        boolean zM17500i = AbstractC3456V.m17500i(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectM17496e);
            jSONObject.put("ad_view_signal", jSONObjectM17493b);
            jSONObject.put("scroll_view_signal", jSONObjectM17494c);
            jSONObject.put("lock_screen_signal", jSONObjectM17495d);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdW)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zM17500i);
            jSONObject.put("screen", AbstractC3456V.m17501j(context));
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to create native ad signals logging JSON.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzk.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) C3250D.m17200c().zzd(zzbci.zzml)).booleanValue() ? zzL(null) : null, C3244B.m17190a().m33297t(bundle, null), false, null);
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33328c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}
