package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3244B;
import java.util.List;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqe extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqe(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqe zza(Context context, View view, zzfcj zzfcjVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqe zzcqeVar = new zzcqe(context);
        List list = zzfcjVar.zzu;
        if (!list.isEmpty() && (resources = zzcqeVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfck zzfckVar = (zzfck) list.get(0);
            float f7 = zzfckVar.zza;
            float f8 = displayMetrics.density;
            zzcqeVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f7 * f8), (int) (zzfckVar.zzb * f8)));
        }
        zzcqeVar.zzb = view;
        zzcqeVar.addView(view);
        C7351t.m32345c();
        zzbzu.zzb(zzcqeVar, zzcqeVar);
        C7351t.m32345c();
        zzbzu.zza(zzcqeVar, zzcqeVar);
        JSONObject jSONObject = zzfcjVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqeVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqeVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqeVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqeVar.addView(relativeLayout);
        return zzcqeVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i7) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i7);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d7) {
        C3244B.m17190a();
        return C7590g.m33276c(this.zza, (int) d7);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
