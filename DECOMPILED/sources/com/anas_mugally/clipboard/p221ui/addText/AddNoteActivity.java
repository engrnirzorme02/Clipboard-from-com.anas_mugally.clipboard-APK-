package com.anas_mugally.clipboard.p221ui.addText;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.lifecycle.AbstractC2658t;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.WatchAdActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import com.android.billingclient.api.Purchase;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p215c1.InterfaceC2979a;
import p220c6.AbstractC3026b;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p225d1.C5209a;
import p225d1.C5211c;
import p233e1.AbstractC5287c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p241f1.C5400E;
import p241f1.ViewOnClickListenerC5396A;
import p247g.C5449c;
import p281k1.C5920K;
import p302m6.AbstractC6406h;
import p313o1.C6540v;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p371v1.C7213n;
import p379w1.AbstractC7305Z;

/* JADX INFO: loaded from: classes.dex */
public class AddNoteActivity extends BaseMyAppAdsActivity implements InterfaceC5372q, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: L0 */
    private int f12945L0;

    /* JADX INFO: renamed from: M0 */
    private int f12946M0;

    /* JADX INFO: renamed from: N0 */
    private boolean f12947N0;

    /* JADX INFO: renamed from: P0 */
    private boolean f12949P0;

    /* JADX INFO: renamed from: Q0 */
    private boolean f12950Q0;

    /* JADX INFO: renamed from: R0 */
    private C5211c f12951R0;

    /* JADX INFO: renamed from: S0 */
    private List f12952S0;

    /* JADX INFO: renamed from: U0 */
    private C6540v f12954U0;

    /* JADX INFO: renamed from: W0 */
    private boolean f12956W0;

    /* JADX INFO: renamed from: O0 */
    private final InterfaceC1429g f12948O0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: o1.u
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AddNoteActivity.m16074O4(this.f24671a);
        }
    });

    /* JADX INFO: renamed from: T0 */
    private final InterfaceC1429g f12953T0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: o1.b
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AddNoteActivity.m16081W4(this.f24645a);
        }
    });

    /* JADX INFO: renamed from: V0 */
    private final InterfaceC1429g f12955V0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: o1.c
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Long.valueOf(AddNoteActivity.m16060B5());
        }
    });

    /* JADX INFO: renamed from: X0 */
    private final InterfaceC1429g f12957X0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: o1.d
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AddNoteActivity.m16069J4(this.f24646a);
        }
    });

    /* JADX INFO: renamed from: Y0 */
    private final AbstractC5382c f12958Y0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: o1.e
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            AddNoteActivity.m16062C5(this.f24647a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$a */
    static final class C3116a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12959a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f12960b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12961c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CharSequence f12962d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Uri f12963e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AddNoteActivity f12964f;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$a$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12965a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12966b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ CharSequence f12967c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddNoteActivity addNoteActivity, CharSequence charSequence, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12966b = addNoteActivity;
                this.f12967c = charSequence;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12966b, this.f12967c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12965a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12966b.m16075P4().f20185y.setText(this.f12967c);
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$a$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12968a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12969b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AddNoteActivity addNoteActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12969b = addNoteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f12969b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12968a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                Toast.makeText(this.f12969b, R.string.error_viewing_text, 0).show();
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$a$c */
        static final class c extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12970a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12971b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AddNoteActivity addNoteActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12971b = addNoteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new c(this.f12971b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12970a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                Toast.makeText(this.f12971b, R.string.error_file_too_large, 0).show();
                this.f12971b.finishAndRemoveTask();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3116a(String str, String str2, CharSequence charSequence, Uri uri, AddNoteActivity addNoteActivity, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12960b = str;
            this.f12961c = str2;
            this.f12962d = charSequence;
            this.f12963e = uri;
            this.f12964f = addNoteActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new C3116a(this.f12960b, this.f12961c, this.f12962d, this.f12963e, this.f12964f, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3116a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r1, r4, r10) == r0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r11, r1, r10) == r0) goto L77;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM16079U4;
            String string;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12959a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    CharSequence string2 = this.f12960b;
                    if (string2 == null && (string2 = this.f12961c) == null && (string2 = this.f12962d) == null) {
                        Uri uri = this.f12963e;
                        if (uri == null) {
                            MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
                            if (myAccessibilityServiceM15245a == null || (objM16079U4 = myAccessibilityServiceM15245a.m15243x()) == null) {
                                objM16079U4 = this.f12964f.m16079U4();
                            }
                            if (objM16079U4 == null || (string = objM16079U4.toString()) == null || (string2 = AbstractC6406h.m27594S0(string).toString()) == null) {
                                string2 = "";
                            }
                        } else {
                            if (AbstractC3041D.m15084i(this.f12964f, uri) > 512000) {
                                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                                c cVar = new c(this.f12964f, null);
                                this.f12959a = 1;
                                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, cVar, this) == objE) {
                                }
                                return C1444v.f4971a;
                            }
                            String strM15079d = AbstractC3041D.m15079d(this.f12964f, this.f12963e);
                            if (strM15079d == null) {
                                strM15079d = "UTF-8";
                            }
                            InputStream inputStreamOpenInputStream = this.f12964f.getContentResolver().openInputStream(this.f12963e);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, strM15079d));
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            sb.append(line);
                                            sb.append("\n");
                                            try {
                                                throw th;
                                            } catch (Throwable th) {
                                                AbstractC3026b.m14999a(inputStreamOpenInputStream, th);
                                                throw th;
                                            }
                                        }
                                        string2 = sb.toString();
                                        AbstractC3026b.m14999a(bufferedReader, null);
                                        AbstractC3026b.m14999a(inputStreamOpenInputStream, null);
                                        if (string2 == null) {
                                            string2 = "";
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            AbstractC3026b.m14999a(bufferedReader, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            } else {
                                string2 = "";
                            }
                        }
                        return objE;
                    }
                    AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                    a aVar = new a(this.f12964f, string2, null);
                    this.f12959a = 2;
                } else {
                    if (i7 == 1) {
                        AbstractC1437o.m6082b(obj);
                        return C1444v.f4971a;
                    }
                    if (i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            } catch (Exception unused) {
                AbstractC6615I0 abstractC6615I0M28164c3 = C6656c0.m28164c();
                b bVar = new b(this.f12964f, null);
                this.f12959a = 3;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$b */
    public static final class C3117b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5287c f12972a;

        public C3117b(AbstractC5287c abstractC5287c) {
            this.f12972a = abstractC5287c;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f12972a.f20175C.setError(null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$c */
    public static final class C3118c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5287c f12973a;

        public C3118c(AbstractC5287c abstractC5287c) {
            this.f12973a = abstractC5287c;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f12973a.f20175C.setError(null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$d */
    static final class C3119d implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f12974a;

        C3119d(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f12974a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f12974a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f12974a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2612D) && (obj instanceof InterfaceC6113i)) {
                return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
            }
            return false;
        }

        public final int hashCode() {
            return mo12586a().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$e */
    static final class C3120e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12975a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12977c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f12978d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f12979e;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12980a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12981b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f12982c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddNoteActivity addNoteActivity, String str, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12981b = addNoteActivity;
                this.f12982c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12981b, this.f12982c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object next;
                AbstractC2005b.m8369e();
                if (this.f12980a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                List list = this.f12981b.f12952S0;
                if (list != null) {
                    String str = this.f12982c;
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC6118n.m27183a(((C5209a) next).m24098d(), str));
                    C5209a c5209a = (C5209a) next;
                    if (c5209a != null) {
                        AddNoteActivity addNoteActivity = this.f12981b;
                        Toast.makeText(addNoteActivity, addNoteActivity.getString(R.string.done_add_to_clipboard, c5209a.m24099e()), 0).show();
                    }
                }
                this.f12981b.finishAndRemoveTask();
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$e$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12983a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12984b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AddNoteActivity addNoteActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12984b = addNoteActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f12984b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12983a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12984b.finish();
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3120e(String str, String str2, String str3, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12977c = str;
            this.f12978d = str2;
            this.f12979e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AddNoteActivity.this.new C3120e(this.f12977c, this.f12978d, this.f12979e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3120e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r2, r5, r18) == r1) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12975a;
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            if (AddNoteActivity.this.m16130T4() == null) {
                AddNoteActivity.this.m16076Q4().mo15146G().mo14878s(new C5211c(0, AddNoteActivity.this.m16080V4(), this.f12977c, this.f12978d, this.f12979e, 0L, false, 97, null));
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(AddNoteActivity.this, this.f12979e, null);
                this.f12975a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) != objE) {
                }
                return objE;
            }
            C5211c c5211cM16130T4 = AddNoteActivity.this.m16130T4();
            AbstractC6118n.m27184b(c5211cM16130T4);
            int iM24110d = c5211cM16130T4.m24110d();
            C5211c c5211cM16130T5 = AddNoteActivity.this.m16130T4();
            AbstractC6118n.m27184b(c5211cM16130T5);
            long jM24114h = c5211cM16130T5.m24114h();
            String str = this.f12977c;
            String str2 = this.f12978d;
            String str3 = this.f12979e;
            C5211c c5211cM16130T6 = AddNoteActivity.this.m16130T4();
            AbstractC6118n.m27184b(c5211cM16130T6);
            AddNoteActivity.this.m16076Q4().mo15146G().mo14873n(new C5211c(iM24110d, jM24114h, str, str2, str3, c5211cM16130T6.m24111e(), false, 64, null));
            AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
            b bVar = new b(AddNoteActivity.this, null);
            this.f12975a = 2;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$f */
    static final class C3121f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12985a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C5209a f12987c;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.addText.AddNoteActivity$f$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12988a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AddNoteActivity f12989b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C5209a f12990c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddNoteActivity addNoteActivity, C5209a c5209a, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12989b = addNoteActivity;
                this.f12990c = c5209a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12989b, this.f12990c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12988a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12989b.m16107o5(this.f12990c.m24098d());
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3121f(C5209a c5209a, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12987c = c5209a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AddNoteActivity.this.new C3121f(this.f12987c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3121f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12985a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC2979a interfaceC2979aMo15144E = AddNoteActivity.this.m16076Q4().mo15144E();
                C5209a c5209a = this.f12987c;
                c5209a.m24103i(interfaceC2979aMo15144E.mo14845e().size());
                interfaceC2979aMo15144E.mo14842b(c5209a);
                C6540v c6540v = AddNoteActivity.this.f12954U0;
                if (c6540v == null) {
                    AbstractC6118n.m27197o("viewModel");
                    c6540v = null;
                }
                c6540v.m27775u(AddNoteActivity.this);
                AddNoteActivity.this.f12950Q0 = true;
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(AddNoteActivity.this, this.f12987c, null);
                this.f12985a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: A5 */
    private final void m16058A5() {
        WatchAdActivity.C3108a c3108a = WatchAdActivity.f12879J0;
        String string = getString(R.string.watch_ad_add_section_reward);
        AbstractC6118n.m27186d(string, "getString(...)");
        this.f12958Y0.m24394a(WatchAdActivity.C3108a.m15789b(c3108a, this, string, null, null, null, 28, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B5 */
    public static final long m16060B5() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public static final void m16062C5(AddNoteActivity addNoteActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        int iM24390b = result.m24390b();
        if (iM24390b == 100) {
            addNoteActivity.m16125x5();
        } else {
            if (iM24390b != 101) {
                return;
            }
            View view = new View(addNoteActivity.getApplication());
            view.setId(R.id.in_app_purchasing);
            addNoteActivity.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public static final AbstractC5287c m16069J4(AddNoteActivity addNoteActivity) {
        return (AbstractC5287c) AbstractC2473f.m10831j(addNoteActivity, R.layout.activity_add_note);
    }

    /* JADX INFO: renamed from: K4 */
    private final void m16070K4() {
        AbstractC5287c abstractC5287cM16075P4 = m16075P4();
        TextInputEditText textInputEditText = abstractC5287cM16075P4.f20185y;
        textInputEditText.setEnabled(true);
        textInputEditText.selectAll();
        textInputEditText.requestFocus(textInputEditText.length() == 0 ? 0 : textInputEditText.length() - 1);
        abstractC5287cM16075P4.f20186z.setEnabled(true);
    }

    /* JADX INFO: renamed from: L4 */
    private final boolean m16071L4(String str, String str2, boolean z7) {
        AbstractC5287c abstractC5287cM16075P4 = m16075P4();
        if (str.length() == 0 && z7) {
            abstractC5287cM16075P4.f20176D.setError(getString(R.string.this_field_can_not_be_empty));
            m16070K4();
            TextInputEditText inputTextTitle = abstractC5287cM16075P4.f20186z;
            AbstractC6118n.m27186d(inputTextTitle, "inputTextTitle");
            m16129z5(inputTextTitle, true);
            return true;
        }
        if (str2.length() != 0) {
            return false;
        }
        abstractC5287cM16075P4.f20175C.setError(getString(R.string.this_field_can_not_be_empty));
        m16070K4();
        TextInputEditText inputTextContent = abstractC5287cM16075P4.f20185y;
        AbstractC6118n.m27186d(inputTextContent, "inputTextContent");
        m16129z5(inputTextContent, true);
        return true;
    }

    /* JADX INFO: renamed from: M4 */
    static /* synthetic */ boolean m16072M4(AddNoteActivity addNoteActivity, String str, String str2, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFoundError");
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        return addNoteActivity.m16071L4(str, str2, z7);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m16073N4() {
        Serializable serializableExtra = getIntent().getSerializableExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16595b());
        AbstractC6118n.m27185c(serializableExtra, "null cannot be cast to non-null type com.anas_mugally.clipboard.database.entity.Text");
        this.f12951R0 = (C5211c) serializableExtra;
        AbstractC5287c abstractC5287cM16075P4 = m16075P4();
        TextInputEditText textInputEditText = abstractC5287cM16075P4.f20185y;
        C5211c c5211c = this.f12951R0;
        AbstractC6118n.m27184b(c5211c);
        textInputEditText.setText(c5211c.m24112f());
        TextInputEditText textInputEditText2 = abstractC5287cM16075P4.f20186z;
        C5211c c5211c2 = this.f12951R0;
        AbstractC6118n.m27184b(c5211c2);
        textInputEditText2.setText(c5211c2.m24113g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final AppDatabase m16074O4(AddNoteActivity addNoteActivity) {
        return AppDatabase.f12597p.m15148b(addNoteActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public final AbstractC5287c m16075P4() {
        Object value = this.f12957X0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (AbstractC5287c) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public final AppDatabase m16076Q4() {
        return (AppDatabase) this.f12948O0.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    private final boolean m16077R4() {
        return getIntent().getBooleanExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), false);
    }

    /* JADX INFO: renamed from: S4 */
    private final InputMethodManager m16078S4() {
        return (InputMethodManager) this.f12953T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public final CharSequence m16079U4() {
        try {
            Object systemService = getSystemService("clipboard");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
            if (itemAt != null) {
                return itemAt.getText();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public final long m16080V4() {
        return ((Number) this.f12955V0.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final InputMethodManager m16081W4(AddNoteActivity addNoteActivity) {
        Object systemService = addNoteActivity.getSystemService("input_method");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* JADX INFO: renamed from: X4 */
    private final void m16082X4(final int i7) {
        m16252P2();
        m16261j3(new InterfaceC5356a() { // from class: o1.f
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AddNoteActivity.m16083Z4(this.f24648a, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public static final C1444v m16083Z4(AddNoteActivity addNoteActivity, int i7) {
        addNoteActivity.m16084a5(i7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: a5 */
    private final void m16084a5(int i7) {
        String string = AbstractC6406h.m27594S0(String.valueOf(m16075P4().f20185y.getText())).toString();
        if (i7 == R.id.clear || i7 == R.id.expended || !m16071L4("", string, false)) {
            if (i7 == R.id.clear) {
                TextInputEditText textInputEditText = m16075P4().f20185y;
                Editable text = textInputEditText.getText();
                if (text != null) {
                    text.clear();
                }
                textInputEditText.requestFocus();
                AbstractC6118n.m27184b(textInputEditText);
                m16129z5(textInputEditText, true);
                AbstractC6118n.m27186d(textInputEditText, "apply(...)");
            } else if (i7 == R.id.expended) {
                m16113r5();
                C1444v c1444v = C1444v.f4971a;
            } else if (i7 != R.id.replace) {
                new C5920K(this, string, false).m26716i(i7);
                C1444v c1444v2 = C1444v.f4971a;
            } else {
                C5400E.f20566F0.m24487a().mo7649g2(m12232H0(), null);
                C1444v c1444v3 = C1444v.f4971a;
            }
            if (i7 == R.id.open_in_dialog) {
                finishAndRemoveTask();
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    private final boolean m16085b5() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: c5 */
    private final void m16086c5(Intent intent, Bundle bundle) {
        final String string = bundle != null ? bundle.getString("editText") : null;
        final String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        final CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
        final Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        m16075P4().f20185y.post(new Runnable() { // from class: o1.m
            @Override // java.lang.Runnable
            public final void run() {
                AddNoteActivity.m16087d5(this.f24658a, string, stringExtra, charSequenceExtra, uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final void m16087d5(AddNoteActivity addNoteActivity, String str, String str2, CharSequence charSequence, Uri uri) {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(addNoteActivity), C6656c0.m28163b(), null, new C3116a(str, str2, charSequence, uri, addNoteActivity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final void m16088e5(AddNoteActivity addNoteActivity, View view) {
        AbstractC7305Z.m32303a(addNoteActivity);
        addNoteActivity.finishAndRemoveTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public static final void m16089f5(View view, AddNoteActivity addNoteActivity) {
        int iHeight;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        boolean z7 = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
        if (z7 != addNoteActivity.f12947N0) {
            addNoteActivity.f12947N0 = z7;
            ScrollView scroll = addNoteActivity.m16075P4().f20179G;
            AbstractC6118n.m27186d(scroll, "scroll");
            ViewGroup.LayoutParams layoutParams = scroll.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (addNoteActivity.f12947N0) {
                iHeight = rect.height() - addNoteActivity.m16075P4().f20183w.getHeight();
                int i7 = marginLayoutParams.height;
                if (i7 > iHeight) {
                    iHeight = i7;
                }
            } else {
                iHeight = -2;
            }
            marginLayoutParams.height = iHeight;
            scroll.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public static final void m16091g5(AddNoteActivity addNoteActivity, View view) {
        addNoteActivity.mo12238b().m23939s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public static final void m16093h5(AddNoteActivity addNoteActivity, View view) {
        addNoteActivity.m16105n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public static final C1444v m16095i5(AddNoteActivity addNoteActivity, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        if (!addNoteActivity.m16071L4("", AbstractC6406h.m27594S0(String.valueOf(addNoteActivity.m16075P4().f20185y.getText())).toString(), false)) {
            AbstractC3041D.m15090o(addNoteActivity, String.valueOf(addNoteActivity.m16075P4().f20185y.getText()), componentName, type, false, 8, null);
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public static final void m16097j5(AddNoteActivity addNoteActivity) {
        addNoteActivity.m16070K4();
        TextInputEditText inputTextContent = addNoteActivity.m16075P4().f20185y;
        AbstractC6118n.m27186d(inputTextContent, "inputTextContent");
        addNoteActivity.m16129z5(inputTextContent, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public static final C1444v m16099k5(AddNoteActivity addNoteActivity, List list) {
        addNoteActivity.f12952S0 = list;
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public static final C1444v m16101l5(AddNoteActivity addNoteActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        if (Build.VERSION.SDK_INT < 28 || !(addNoteActivity.m16075P4().f20185y.isFocused() || addNoteActivity.m16075P4().f20186z.isFocused())) {
            addCallback.m23915j(false);
            addNoteActivity.finishAndRemoveTask();
        } else {
            addNoteActivity.m16075P4().f20185y.clearFocus();
            addNoteActivity.m16075P4().f20186z.clearFocus();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public static final void m16103m5(AddNoteActivity addNoteActivity, boolean z7) {
        if (z7) {
            return;
        }
        FrameLayout layAd = addNoteActivity.m16075P4().f20173A;
        AbstractC6118n.m27186d(layAd, "layAd");
        BaseMyAppAdsActivity.m16158V3(addNoteActivity, layAd, R.layout.myapp_naitve_small, null, 4, null);
    }

    /* JADX INFO: renamed from: n5 */
    private final void m16105n5() {
        C5211c c5211c = this.f12951R0;
        if (c5211c == null) {
            m16119u5();
        } else {
            AbstractC6118n.m27184b(c5211c);
            m16107o5(c5211c.m24109c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public final void m16107o5(String str) {
        String string = AbstractC6406h.m27594S0(String.valueOf(m16075P4().f20186z.getText())).toString();
        String string2 = AbstractC6406h.m27594S0(String.valueOf(m16075P4().f20185y.getText())).toString();
        if (!m16072M4(this, string, string2, false, 4, null) && AbstractC3041D.m15081f(this, string2)) {
            AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new C3120e(string, string2, str, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: p5 */
    private final void m16109p5() {
        if (m16085b5()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC1030Z.m4494t0(m16075P4().m10849k(), new InterfaceC0993G() { // from class: o1.h
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return AddNoteActivity.m16111q5(this.f24652a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public static final C0982A0 m16111q5(AddNoteActivity addNoteActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        addNoteActivity.f12946M0 = c0247bM4272f.f985b;
        addNoteActivity.f12945L0 = c0247bM4272f.f987d;
        addNoteActivity.m16075P4().f20177E.setPadding(0, addNoteActivity.f12946M0, 0, 0);
        addNoteActivity.m16075P4().f20174B.setPadding(0, 0, 0, addNoteActivity.f12945L0);
        view.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        if (C3034A.f12453a.m15018E(addNoteActivity)) {
            AppBarLayout appbar = addNoteActivity.m16075P4().f20183w;
            AbstractC6118n.m27186d(appbar, "appbar");
            appbar.setPadding(appbar.getPaddingLeft(), appbar.getPaddingTop(), c0247bM4272f.f986c, appbar.getPaddingBottom());
            ScrollView scroll = addNoteActivity.m16075P4().f20179G;
            AbstractC6118n.m27186d(scroll, "scroll");
            scroll.setPadding(scroll.getPaddingLeft(), scroll.getPaddingTop(), c0247bM4272f.f986c, scroll.getPaddingBottom());
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: r5 */
    private final void m16113r5() {
        final AbstractC5287c abstractC5287cM16075P4 = m16075P4();
        LinearLayout layChild = abstractC5287cM16075P4.f20174B;
        AbstractC6118n.m27186d(layChild, "layChild");
        ViewGroup.LayoutParams layoutParams = layChild.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        layChild.setLayoutParams(layoutParams);
        abstractC5287cM16075P4.m10849k().post(new Runnable() { // from class: o1.g
            @Override // java.lang.Runnable
            public final void run() {
                AddNoteActivity.m16115s5(abstractC5287cM16075P4, this);
            }
        });
        this.f12956W0 = !this.f12956W0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final void m16115s5(AbstractC5287c abstractC5287c, AddNoteActivity addNoteActivity) {
        int height = (((abstractC5287c.f20177E.getHeight() - abstractC5287c.f20183w.getHeight()) - abstractC5287c.f20176D.getHeight()) - (addNoteActivity.f12946M0 * 2)) - addNoteActivity.f12945L0;
        LinearLayout layChild = abstractC5287c.f20174B;
        AbstractC6118n.m27186d(layChild, "layChild");
        ViewGroup.LayoutParams layoutParams = layChild.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        layChild.setLayoutParams(layoutParams);
        abstractC5287c.f20185y.setMinHeight(height);
        abstractC5287c.f20182v.removeItem(R.id.expended);
    }

    /* JADX INFO: renamed from: t5 */
    private final void m16117t5() {
        if (m15845V1()) {
            m16058A5();
        } else {
            m16125x5();
        }
    }

    /* JADX INFO: renamed from: u5 */
    private final void m16119u5() {
        C7213n c7213n = new C7213n(this, m16076Q4());
        ImageView save = m16075P4().f20178F;
        AbstractC6118n.m27186d(save, "save");
        c7213n.m31849j(save, this.f12952S0, new InterfaceC5367l() { // from class: o1.i
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AddNoteActivity.m16121v5(this.f24653a, (String) obj);
            }
        }, new InterfaceC5356a() { // from class: o1.j
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AddNoteActivity.m16123w5(this.f24654a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public static final C1444v m16121v5(AddNoteActivity addNoteActivity, String categoryName) {
        AbstractC6118n.m27187e(categoryName, "categoryName");
        addNoteActivity.m16107o5(categoryName);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public static final C1444v m16123w5(AddNoteActivity addNoteActivity) {
        addNoteActivity.m16117t5();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: x5 */
    private final void m16125x5() {
        final ViewOnClickListenerC5396A viewOnClickListenerC5396AM24480a = ViewOnClickListenerC5396A.f20555J0.m24480a(null);
        viewOnClickListenerC5396AM24480a.m24479t2(new InterfaceC5371p() { // from class: o1.k
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AddNoteActivity.m16127y5(viewOnClickListenerC5396AM24480a, this, (C5209a) obj, ((Boolean) obj2).booleanValue());
            }
        });
        viewOnClickListenerC5396AM24480a.mo7649g2(m12232H0(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public static final C1444v m16127y5(ViewOnClickListenerC5396A viewOnClickListenerC5396A, AddNoteActivity addNoteActivity, C5209a category, boolean z7) {
        AbstractC6118n.m27187e(category, "category");
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(viewOnClickListenerC5396A), C6656c0.m28163b(), null, addNoteActivity.new C3121f(category, null), 2, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: z5 */
    private final void m16129z5(TextInputEditText textInputEditText, boolean z7) {
        m16078S4().showSoftInput(textInputEditText, 1);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    /* JADX INFO: renamed from: T4 */
    public final C5211c m16130T4() {
        return this.f12951R0;
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        try {
            m16125x5();
            m16075P4().f20173A.setVisibility(8);
            this.f12949P0 = true;
            setResult(-1, new Intent().putExtra("changePurchased", this.f12949P0));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m16131Y4(String p7, String p8, boolean z7) {
        AbstractC6118n.m27187e(p7, "p1");
        AbstractC6118n.m27187e(p8, "p2");
        TextInputEditText textInputEditText = m16075P4().f20185y;
        String strValueOf = String.valueOf(textInputEditText.getText());
        textInputEditText.setText(!z7 ? AbstractC6406h.m27551E(strValueOf, p7, p8, false, 4, null) : AbstractC6406h.m27553G(strValueOf, p7, p8, false, 4, null));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (m16077R4()) {
            return;
        }
        overridePendingTransition(R.anim.anim_scala_dialog, R.anim.anim_scala_dialog_end);
    }

    @Override // p238e6.InterfaceC5372q
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
        m16131Y4((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        return C1444v.f4971a;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        m16109p5();
        AbstractC5287c abstractC5287cM16075P4 = m16075P4();
        if (bundle != null) {
            if (bundle.getBoolean("isFullScreenMode", this.f12956W0) != this.f12956W0) {
                m16113r5();
            }
        } else if (m16077R4()) {
            m16113r5();
        }
        abstractC5287cM16075P4.f20177E.setOnClickListener(new View.OnClickListener() { // from class: o1.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNoteActivity.m16091g5(this.f24657a, view);
            }
        });
        abstractC5287cM16075P4.f20174B.setOnClickListener(null);
        abstractC5287cM16075P4.f20178F.setOnClickListener(new View.OnClickListener() { // from class: o1.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNoteActivity.m16093h5(this.f24663a, view);
            }
        });
        ActionsLayout actionsLayout = abstractC5287cM16075P4.f20182v;
        actionsLayout.setOnMenuItemClickListener(this);
        actionsLayout.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: o1.o
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AddNoteActivity.m16095i5(this.f24664a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        TextInputEditText inputTextTitle = abstractC5287cM16075P4.f20186z;
        AbstractC6118n.m27186d(inputTextTitle, "inputTextTitle");
        inputTextTitle.addTextChangedListener(new C3117b(abstractC5287cM16075P4));
        TextInputEditText inputTextContent = abstractC5287cM16075P4.f20185y;
        AbstractC6118n.m27186d(inputTextContent, "inputTextContent");
        inputTextContent.addTextChangedListener(new C3118c(abstractC5287cM16075P4));
        ImageView imgOpenApp = abstractC5287cM16075P4.f20184x;
        AbstractC6118n.m27186d(imgOpenApp, "imgOpenApp");
        imgOpenApp.setVisibility(m16077R4() ? 8 : 0);
        abstractC5287cM16075P4.f20184x.setOnClickListener(new View.OnClickListener() { // from class: o1.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNoteActivity.m16088e5(this.f24665a, view);
            }
        });
        final View viewM10849k = m16075P4().m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        viewM10849k.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o1.q
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AddNoteActivity.m16089f5(viewM10849k, this);
            }
        });
        boolean zHasExtra = getIntent().hasExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16595b());
        if (zHasExtra) {
            m16073N4();
            m16075P4().f20182v.removeItem(R.id.open_in_dialog);
        } else {
            m16075P4().f20186z.setText(DateFormat.format("MMM d, y hh:mm a", m16080V4()));
            Intent intent = getIntent();
            AbstractC6118n.m27186d(intent, "getIntent(...)");
            m16086c5(intent, bundle);
        }
        if (zHasExtra) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o1.r
                @Override // java.lang.Runnable
                public final void run() {
                    AddNoteActivity.m16097j5(this.f24668a);
                }
            }, 300L);
        }
        C6540v c6540v = (C6540v) new C2635a0(this).m12591a(C6540v.class);
        c6540v.m27775u(this);
        c6540v.m27766i().m12674k(this, new C3119d(new InterfaceC5367l() { // from class: o1.s
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AddNoteActivity.m16099k5(this.f24669a, (List) obj);
            }
        }));
        this.f12954U0 = c6540v;
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: o1.t
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AddNoteActivity.m16101l5(this.f24670a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        AbstractC6118n.m27187e(item, "item");
        m16082X4(item.getItemId());
        return true;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        View view = m16075P4().f20181I;
        AbstractC6118n.m27186d(view, "view");
        view.setVisibility(m15845V1() ? 0 : 8);
        FrameLayout layAd = m16075P4().f20173A;
        AbstractC6118n.m27186d(layAd, "layAd");
        layAd.setVisibility(m15845V1() ? 0 : 8);
        if (m15845V1()) {
            FrameLayout layAd2 = m16075P4().f20173A;
            AbstractC6118n.m27186d(layAd2, "layAd");
            AbstractActivityC3130a.m16217T2(this, layAd2, R.layout.admob_naitve_small, null, new AbstractActivityC3130a.a() { // from class: o1.a
                @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
                /* JADX INFO: renamed from: a */
                public final void mo8536a(boolean z7) {
                    AddNoteActivity.m16103m5(this.f24644a, z7);
                }
            }, 4, null);
        }
        if (m16077R4()) {
            return;
        }
        overridePendingTransition(R.anim.anim_scala_dialog, R.anim.anim_scala_dialog_end);
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("editText", String.valueOf(m16075P4().f20185y.getText()));
        outState.putBoolean("isFullScreenMode", this.f12956W0);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStart() {
        Application application = getApplication();
        AbstractC6118n.m27185c(application, "null cannot be cast to non-null type com.anas_mugally.clipboard.MyApplication");
        MyApplication.m15101k((MyApplication) application, false, 1, null);
        super.onStart();
    }
}
