package com.anas_mugally.clipboard.p221ui.notes;

import android.os.Bundle;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.notes.BrowseNotesDialogActivity;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5303k;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
public final class BrowseNotesDialogActivity extends AbstractViewOnClickListenerC3141a {

    /* JADX INFO: renamed from: h1 */
    private AbstractC5303k f13135h1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z5 */
    public static final C1444v m16474Z5(BrowseNotesDialogActivity browseNotesDialogActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        browseNotesDialogActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    @Override // com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a, com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f13135h1 = (AbstractC5303k) AbstractC2473f.m10831j(this, R.layout.activity_browse_text);
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: w1.y
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return BrowseNotesDialogActivity.m16474Z5(this.f29183a, (AbstractC5158A) obj);
            }
        }, 2, null);
        super.onCreate(bundle);
    }
}
