package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: androidx.transition.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2838f {

    /* JADX INFO: renamed from: androidx.transition.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static <T, V> ObjectAnimator m14125a(T t7, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t7, property, (TypeConverter) null, path);
        }
    }

    /* JADX INFO: renamed from: a */
    static ObjectAnimator m14124a(Object obj, Property property, Path path) {
        return a.m14125a(obj, property, path);
    }
}
