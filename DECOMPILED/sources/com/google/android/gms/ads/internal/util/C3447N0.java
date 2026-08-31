package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import java.util.Locale;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.N0 */
/* JADX INFO: loaded from: classes.dex */
public class C3447N0 extends C3437I0 {
    /* JADX INFO: renamed from: m */
    static final /* synthetic */ WindowInsets m17469m(Activity activity, View view, WindowInsets windowInsets) {
        if (C7351t.m32354l().zzo().zzu() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                InterfaceC3494q0 interfaceC3494q0Zzo = C7351t.m32354l().zzo();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                interfaceC3494q0Zzo.zzv(strConcat);
            } else {
                C7351t.m32354l().zzo().zzv("");
            }
        }
        m17470n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: n */
    private static final void m17470n(boolean z7, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i7 = attributes.layoutInDisplayCutoutMode;
        int i8 = true != z7 ? 2 : 1;
        if (i8 != i7) {
            attributes.layoutInDisplayCutoutMode = i8;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: i */
    public final void mo17471i(final Activity activity) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbt)).booleanValue() && C7351t.m32354l().zzo().zzu() == null && !activity.isInMultiWindowMode()) {
            m17470n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.J0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return C3447N0.m17469m(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: j */
    public final int mo17472j(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
