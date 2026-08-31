package p396y2;

import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: y2.m */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC7525m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractBinderC7534v f30137a;

    ViewOnClickListenerC7525m(AbstractBinderC7534v abstractBinderC7534v) {
        Objects.requireNonNull(abstractBinderC7534v);
        this.f30137a = abstractBinderC7534v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractBinderC7534v abstractBinderC7534v = this.f30137a;
        abstractBinderC7534v.f30156G = 2;
        abstractBinderC7534v.f30157a.finish();
    }
}
