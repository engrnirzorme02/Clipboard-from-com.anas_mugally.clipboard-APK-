package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.carousel.b */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4448b {

    /* JADX INFO: renamed from: a */
    final int f16692a;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$a */
    class a extends AbstractC4448b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f16693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i7, CarouselLayoutManager carouselLayoutManager) {
            super(i7, null);
            this.f16693b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: d */
        int mo19950d() {
            return this.f16693b.m13424c0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: e */
        int mo19951e() {
            return this.f16693b.m13438j0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: f */
        int mo19952f() {
            return this.f16693b.m13460t0() - this.f16693b.m13441k0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: g */
        int mo19953g() {
            return mo19954h();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: h */
        int mo19954h() {
            return 0;
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: i */
        public void mo19955i(View view, int i7, int i8) {
            int iMo19951e = mo19951e();
            this.f16693b.m13384E0(view, iMo19951e, i7, iMo19951e + m19957k(view), i8);
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: j */
        public void mo19956j(View view, Rect rect, float f7, float f8) {
            view.offsetTopAndBottom((int) (f8 - (rect.top + f7)));
        }

        /* JADX INFO: renamed from: k */
        int m19957k(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f16693b.m13419Y(view) + ((ViewGroup.MarginLayoutParams) c2766q).leftMargin + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b */
    class b extends AbstractC4448b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CarouselLayoutManager f16694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i7, CarouselLayoutManager carouselLayoutManager) {
            super(i7, null);
            this.f16694b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: d */
        int mo19950d() {
            return this.f16694b.m13424c0() - this.f16694b.m13436i0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: e */
        int mo19951e() {
            return 0;
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: f */
        int mo19952f() {
            return this.f16694b.m13460t0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: g */
        int mo19953g() {
            return this.f16694b.m19928G2() ? mo19952f() : mo19951e();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: h */
        int mo19954h() {
            return this.f16694b.m13443l0();
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: i */
        public void mo19955i(View view, int i7, int i8) {
            int iMo19954h = mo19954h();
            this.f16694b.m13384E0(view, i7, iMo19954h, i8, iMo19954h + m19958k(view));
        }

        @Override // com.google.android.material.carousel.AbstractC4448b
        /* JADX INFO: renamed from: j */
        public void mo19956j(View view, Rect rect, float f7, float f8) {
            view.offsetLeftAndRight((int) (f8 - (rect.left + f7)));
        }

        /* JADX INFO: renamed from: k */
        int m19958k(View view) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return this.f16694b.m13418X(view) + ((ViewGroup.MarginLayoutParams) c2766q).topMargin + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin;
        }
    }

    /* synthetic */ AbstractC4448b(int i7, a aVar) {
        this(i7);
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC4448b m19947a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: b */
    static AbstractC4448b m19948b(CarouselLayoutManager carouselLayoutManager, int i7) {
        if (i7 == 0) {
            return m19947a(carouselLayoutManager);
        }
        if (i7 == 1) {
            return m19949c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC4448b m19949c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* JADX INFO: renamed from: d */
    abstract int mo19950d();

    /* JADX INFO: renamed from: e */
    abstract int mo19951e();

    /* JADX INFO: renamed from: f */
    abstract int mo19952f();

    /* JADX INFO: renamed from: g */
    abstract int mo19953g();

    /* JADX INFO: renamed from: h */
    abstract int mo19954h();

    /* JADX INFO: renamed from: i */
    abstract void mo19955i(View view, int i7, int i8);

    /* JADX INFO: renamed from: j */
    abstract void mo19956j(View view, Rect rect, float f7, float f8);

    private AbstractC4448b(int i7) {
        this.f16692a = i7;
    }
}
