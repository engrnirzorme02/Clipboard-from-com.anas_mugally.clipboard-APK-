package p339r1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p233e1.AbstractC5278V;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p371v1.C7210k;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6878a extends RecyclerView.AbstractC2757h {

    /* JADX INFO: renamed from: d */
    private final InterfaceC5371p f27622d;

    /* JADX INFO: renamed from: e */
    private List f27623e;

    /* JADX INFO: renamed from: r1.a$a */
    public enum a {
        USE,
        EDIT,
        DELETE;


        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ InterfaceC2059a f27628e = AbstractC2060b.m8524a(m30078c());
    }

    /* JADX INFO: renamed from: r1.a$b */
    public final class b extends RecyclerView.AbstractC2749E {

        /* JADX INFO: renamed from: u */
        private final AbstractC5278V f27629u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ C6878a f27630v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6878a c6878a, AbstractC5278V binding) {
            super(binding.m10849k());
            AbstractC6118n.m27187e(binding, "binding");
            this.f27630v = c6878a;
            this.f27629u = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: V */
        public static final void m30083V(AiPrompt aiPrompt, C6878a c6878a, View view) {
            c6878a.f27622d.invoke(AiPrompt.copy$default(aiPrompt, "custom", null, null, false, 0L, 30, null), a.USE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: W */
        public static final boolean m30084W(b bVar, AiPrompt aiPrompt, View view) {
            bVar.m30085X(aiPrompt);
            return true;
        }

        /* JADX INFO: renamed from: X */
        private final void m30085X(final AiPrompt aiPrompt) {
            Context context = this.f27629u.m10849k().getContext();
            AbstractC6118n.m27184b(context);
            C7210k c7210k = new C7210k(context);
            String string = context.getString(R.string.text_edit);
            AbstractC6118n.m27186d(string, "getString(...)");
            C7210k.b bVar = new C7210k.b(context.getDrawable(R.drawable.ic_edit_black), false, 2, null);
            final C6878a c6878a = this.f27630v;
            C7210k.d dVar = new C7210k.d(string, bVar, new InterfaceC5356a() { // from class: r1.d
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C6878a.b.m30086Y(c6878a, aiPrompt);
                }
            }, null, null, 24, null);
            String string2 = context.getString(R.string.delete);
            AbstractC6118n.m27186d(string2, "getString(...)");
            C7210k.b bVar2 = new C7210k.b(context.getDrawable(R.drawable.ic_delete), false, 2, null);
            final C6878a c6878a2 = this.f27630v;
            List listL = AbstractC1638q.m6767l(dVar, new C7210k.d(string2, bVar2, new InterfaceC5356a() { // from class: r1.e
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C6878a.b.m30087Z(c6878a2, aiPrompt);
                }
            }, null, null, 24, null));
            MaterialButton chipPrompt = this.f27629u.f20120v;
            AbstractC6118n.m27186d(chipPrompt, "chipPrompt");
            C7210k.m31796O(c7210k, chipPrompt, listL, null, null, true, 12, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: Y */
        public static final C1444v m30086Y(C6878a c6878a, AiPrompt aiPrompt) {
            c6878a.f27622d.invoke(aiPrompt, a.EDIT);
            return C1444v.f4971a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: Z */
        public static final C1444v m30087Z(C6878a c6878a, AiPrompt aiPrompt) {
            c6878a.f27622d.invoke(aiPrompt, a.DELETE);
            return C1444v.f4971a;
        }

        /* JADX INFO: renamed from: U */
        public final void m30088U(int i7, final AiPrompt prompt) {
            AbstractC6118n.m27187e(prompt, "prompt");
            String title = prompt.getTitle();
            AbstractC5278V abstractC5278V = this.f27629u;
            final C6878a c6878a = this.f27630v;
            C3034A c3034a = C3034A.f12453a;
            Context context = abstractC5278V.m10849k().getContext();
            AbstractC6118n.m27186d(context, "getContext(...)");
            int iM15020G = c3034a.m15020G(context, 10);
            LinearLayout parent = abstractC5278V.f20121w;
            AbstractC6118n.m27186d(parent, "parent");
            parent.setPadding(iM15020G, parent.getPaddingTop(), i7 + 1 == c6878a.mo8548g() ? iM15020G : 0, parent.getPaddingBottom());
            abstractC5278V.f20120v.setText(title);
            abstractC5278V.f20120v.setOnClickListener(new View.OnClickListener() { // from class: r1.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6878a.b.m30083V(prompt, c6878a, view);
                }
            });
            abstractC5278V.f20120v.setOnLongClickListener(new View.OnLongClickListener() { // from class: r1.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C6878a.b.m30084W(this.f27633a, prompt, view);
                }
            });
        }
    }

    public C6878a(InterfaceC5371p onPromptAction) {
        AbstractC6118n.m27187e(onPromptAction, "onPromptAction");
        this.f27622d = onPromptAction;
        this.f27623e = AbstractC1638q.m6765j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo3682q(b holder, int i7) {
        AbstractC6118n.m27187e(holder, "holder");
        holder.m30088U(i7, (AiPrompt) this.f27623e.get(i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b mo3683s(ViewGroup parent, int i7) {
        AbstractC6118n.m27187e(parent, "parent");
        AbstractC5278V abstractC5278VM24293u = AbstractC5278V.m24293u(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC6118n.m27186d(abstractC5278VM24293u, "inflate(...)");
        return new b(this, abstractC5278VM24293u);
    }

    /* JADX INFO: renamed from: E */
    public final void m30077E(List newPrompts) {
        AbstractC6118n.m27187e(newPrompts, "newPrompts");
        this.f27623e = newPrompts;
        m13322l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2757h
    /* JADX INFO: renamed from: g */
    public int mo8548g() {
        return this.f27623e.size();
    }
}
