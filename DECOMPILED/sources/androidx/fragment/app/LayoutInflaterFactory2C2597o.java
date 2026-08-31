package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p248g0.AbstractC5453c;
import p264i0.C5662c;

/* JADX INFO: renamed from: androidx.fragment.app.o */
/* JADX INFO: loaded from: classes.dex */
class LayoutInflaterFactory2C2597o implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    final AbstractC2599q f10230a;

    /* JADX INFO: renamed from: androidx.fragment.app.o$a */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2604v f10231a;

        a(C2604v c2604v) {
            this.f10231a = c2604v;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = this.f10231a.m12466k();
            this.f10231a.m12467m();
            AbstractC2579F.m11972r((ViewGroup) abstractComponentCallbacksC2591iM12466k.f10138T.getParent(), LayoutInflaterFactory2C2597o.this.f10230a).m11981n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    LayoutInflaterFactory2C2597o(AbstractC2599q abstractC2599q) {
        this.f10230a = abstractC2599q;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2604v c2604vM12400u;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f10230a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5453c.f20753a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC5453c.f20754b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5453c.f20755c, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC5453c.f20756d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC2595m.m12264b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12376g0 = resourceId != -1 ? this.f10230a.m12376g0(resourceId) : null;
        if (abstractComponentCallbacksC2591iM12376g0 == null && string != null) {
            abstractComponentCallbacksC2591iM12376g0 = this.f10230a.m12379h0(string);
        }
        if (abstractComponentCallbacksC2591iM12376g0 == null && id != -1) {
            abstractComponentCallbacksC2591iM12376g0 = this.f10230a.m12376g0(id);
        }
        if (abstractComponentCallbacksC2591iM12376g0 == null) {
            abstractComponentCallbacksC2591iM12376g0 = this.f10230a.m12399t0().mo12267a(context.getClassLoader(), attributeValue);
            abstractComponentCallbacksC2591iM12376g0.f10172z = true;
            abstractComponentCallbacksC2591iM12376g0.f10127I = resourceId != 0 ? resourceId : id;
            abstractComponentCallbacksC2591iM12376g0.f10128J = id;
            abstractComponentCallbacksC2591iM12376g0.f10129K = string;
            abstractComponentCallbacksC2591iM12376g0.f10119A = true;
            AbstractC2599q abstractC2599q = this.f10230a;
            abstractComponentCallbacksC2591iM12376g0.f10123E = abstractC2599q;
            abstractComponentCallbacksC2591iM12376g0.f10124F = abstractC2599q.m12403v0();
            abstractComponentCallbacksC2591iM12376g0.m12124H0(this.f10230a.m12403v0().m12269j(), attributeSet, abstractComponentCallbacksC2591iM12376g0.f10147b);
            c2604vM12400u = this.f10230a.m12378h(abstractComponentCallbacksC2591iM12376g0);
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2591iM12376g0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (abstractComponentCallbacksC2591iM12376g0.f10119A) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            abstractComponentCallbacksC2591iM12376g0.f10119A = true;
            AbstractC2599q abstractC2599q2 = this.f10230a;
            abstractComponentCallbacksC2591iM12376g0.f10123E = abstractC2599q2;
            abstractComponentCallbacksC2591iM12376g0.f10124F = abstractC2599q2.m12403v0();
            abstractComponentCallbacksC2591iM12376g0.m12124H0(this.f10230a.m12403v0().m12269j(), attributeSet, abstractComponentCallbacksC2591iM12376g0.f10147b);
            c2604vM12400u = this.f10230a.m12400u(abstractComponentCallbacksC2591iM12376g0);
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC2591iM12376g0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C5662c.m25182g(abstractComponentCallbacksC2591iM12376g0, viewGroup);
        abstractComponentCallbacksC2591iM12376g0.f10137S = viewGroup;
        c2604vM12400u.m12467m();
        c2604vM12400u.m12465j();
        View view2 = abstractComponentCallbacksC2591iM12376g0.f10138T;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (abstractComponentCallbacksC2591iM12376g0.f10138T.getTag() == null) {
            abstractComponentCallbacksC2591iM12376g0.f10138T.setTag(string);
        }
        abstractComponentCallbacksC2591iM12376g0.f10138T.addOnAttachStateChangeListener(new a(c2604vM12400u));
        return abstractComponentCallbacksC2591iM12376g0.f10138T;
    }
}
