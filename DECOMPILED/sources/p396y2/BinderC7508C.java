package p396y2;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;

/* JADX INFO: renamed from: y2.C */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7508C extends AbstractBinderC7534v {
    public BinderC7508C(Activity activity) {
        super(activity);
    }

    @Override // p396y2.AbstractBinderC7534v, com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) {
        AbstractC3490o0.m17545k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f30156G = 4;
        this.f30157a.finish();
    }
}
