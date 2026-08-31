package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC2471d;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC2471d {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f9422a = new SparseIntArray(0);

    /* JADX INFO: renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$a */
    private static class C2476a {

        /* JADX INFO: renamed from: a */
        static final HashMap f9423a = new HashMap(0);
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: a */
    public List mo10821a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: b */
    public AbstractC2474g mo10817b(InterfaceC2472e interfaceC2472e, View view, int i7) {
        if (f9422a.get(i7) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: c */
    public AbstractC2474g mo10818c(InterfaceC2472e interfaceC2472e, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f9422a.get(i7) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: d */
    public int mo10819d(String str) {
        Integer num;
        if (str == null || (num = (Integer) C2476a.f9423a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
