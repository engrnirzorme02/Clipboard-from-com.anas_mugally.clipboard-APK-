package p333q3;

import android.util.Property;
import android.view.ViewGroup;
import p325p3.AbstractC6746g;

/* JADX INFO: renamed from: q3.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6828c extends Property {

    /* JADX INFO: renamed from: a */
    public static final Property f27409a = new C6828c("childrenAlpha");

    private C6828c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f7 = (Float) viewGroup.getTag(AbstractC6746g.f26398F);
        return f7 != null ? f7 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f7) {
        float fFloatValue = f7.floatValue();
        viewGroup.setTag(AbstractC6746g.f26398F, f7);
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            viewGroup.getChildAt(i7).setAlpha(fFloatValue);
        }
    }
}
