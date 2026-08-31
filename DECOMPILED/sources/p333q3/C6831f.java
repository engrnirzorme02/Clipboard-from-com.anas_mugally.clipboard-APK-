package p333q3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.C2400k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q3.f */
/* JADX INFO: loaded from: classes2.dex */
public class C6831f {

    /* JADX INFO: renamed from: a */
    private final C2400k f27414a = new C2400k();

    /* JADX INFO: renamed from: b */
    private final C2400k f27415b = new C2400k();

    /* JADX INFO: renamed from: a */
    private static void m29851a(C6831f c6831f, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c6831f.m29861k(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c6831f.m29862l(objectAnimator.getPropertyName(), C6832g.m29863b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* JADX INFO: renamed from: b */
    private PropertyValuesHolder[] m29852b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i7 = 0; i7 < propertyValuesHolderArr.length; i7++) {
            propertyValuesHolderArr2[i7] = propertyValuesHolderArr[i7].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* JADX INFO: renamed from: c */
    public static C6831f m29853c(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return m29854d(context, resourceId);
    }

    /* JADX INFO: renamed from: d */
    public static C6831f m29854d(Context context, int i7) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m29855e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m29855e(arrayList);
        } catch (Exception e7) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i7), e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static C6831f m29855e(List list) {
        C6831f c6831f = new C6831f();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            m29851a(c6831f, (Animator) list.get(i7));
        }
        return c6831f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6831f) {
            return this.f27414a.equals(((C6831f) obj).f27414a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public ObjectAnimator m29856f(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, m29857g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        m29858h(str).m29864a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: g */
    public PropertyValuesHolder[] m29857g(String str) {
        if (m29859i(str)) {
            return m29852b((PropertyValuesHolder[]) this.f27415b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    public C6832g m29858h(String str) {
        if (m29860j(str)) {
            return (C6832g) this.f27414a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f27414a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m29859i(String str) {
        return this.f27415b.get(str) != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m29860j(String str) {
        return this.f27414a.get(str) != null;
    }

    /* JADX INFO: renamed from: k */
    public void m29861k(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f27415b.put(str, propertyValuesHolderArr);
    }

    /* JADX INFO: renamed from: l */
    public void m29862l(String str, C6832g c6832g) {
        this.f27414a.put(str, c6832g);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f27414a + "}\n";
    }
}
