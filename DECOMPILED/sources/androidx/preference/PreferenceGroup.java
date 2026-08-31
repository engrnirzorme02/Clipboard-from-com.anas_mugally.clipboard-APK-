package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.C2400k;
import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.List;
import p025D.AbstractC0168k;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: O */
    final C2400k f10592O;

    /* JADX INFO: renamed from: P */
    private final Handler f10593P;

    /* JADX INFO: renamed from: Q */
    private final List f10594Q;

    /* JADX INFO: renamed from: R */
    private boolean f10595R;

    /* JADX INFO: renamed from: S */
    private int f10596S;

    /* JADX INFO: renamed from: T */
    private boolean f10597T;

    /* JADX INFO: renamed from: U */
    private int f10598U;

    /* JADX INFO: renamed from: V */
    private final Runnable f10599V;

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroup$a */
    class RunnableC2673a implements Runnable {
        RunnableC2673a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f10592O.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10592O = new C2400k();
        this.f10593P = new Handler(Looper.getMainLooper());
        this.f10595R = true;
        this.f10596S = 0;
        this.f10597T = false;
        this.f10598U = C3553a.e.API_PRIORITY_OTHER;
        this.f10599V = new RunnableC2673a();
        this.f10594Q = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27613v0, i7, i8);
        int i9 = AbstractC6877g.f27617x0;
        this.f10595R = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i9, i9, true);
        int i10 = AbstractC6877g.f27615w0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            m12756Z(AbstractC0168k.m839d(typedArrayObtainStyledAttributes, i10, i10, C3553a.e.API_PRIORITY_OTHER));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: C */
    public void mo12730C(boolean z7) {
        super.mo12730C(z7);
        int iM12755Y = m12755Y();
        for (int i7 = 0; i7 < iM12755Y; i7++) {
            m12754X(i7).m12732J(this, z7);
        }
    }

    /* JADX INFO: renamed from: X */
    public Preference m12754X(int i7) {
        return (Preference) this.f10594Q.get(i7);
    }

    /* JADX INFO: renamed from: Y */
    public int m12755Y() {
        return this.f10594Q.size();
    }

    /* JADX INFO: renamed from: Z */
    public void m12756Z(int i7) {
        if (i7 != Integer.MAX_VALUE && !m12752y()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f10598U = i7;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
