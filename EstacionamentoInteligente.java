importjava.util.Date;
importjava.util.HashMap;
importjava.util.Map;

  public class Estacionamento{

     private static final Map<String,Vaga>vagas = newHashMap<>();
     private static final Map<String,EstacionamentoPago>estacionamentosPagos = newHashMap<>();
    public static void main(String[]args){

//Cadastra as vagas disponíveis

 cadastrarVagas ();
 //Permite o usuário pagar a tarifa de estacionamento online,antes ou depois de estacionar

pagar Estacionamento Online();
//Verificaostatusdoestacionamento
verificar Status Estacionamento();
}
private static void cadastrar Vagas(){
   //Vagasdisponíveis
vagas.put("A1",newVaga("A1",true));
vagas.put("A2",newVaga("A2",true));
vagas.put("A3",newVaga("A3",true));
vagas.put("B1",newVaga("B1",true));
vagas.put("B2",newVaga("B2",true));
vagas.put("B3",newVaga("B3",true));
}
private static void pagarEstacionamentoOnline(){
   //Pagamento do estacionamento online
   System.out.println("Pagamento do estacionamento online");
  //Solicita a placa do veículo
    String placa = System.console().readLine("Informe a placa do veículo:");
//Verifica se a vaga está disponível

if(!vagas.get(placa).isDisponivel()){
    System.out.println("A vaga está indisponível.");
return;
}

//Gera um código de pagamento

   String codigo Pagamento = gerarCodigoPagamento();

//Registra o pagamento

 estacionamentosPagos.put(codigoPagamento,newEstacionamentoPago(placa, newDate()));

 //Informa o código de pagamento

  System.out.println("Código de pagamento:"+codigoPagamento);
}
  private static void verificarStatusEstacionamento(){
  //Verifica o status do estacionamento

      System.out.println("Verificandoostatusdoestacionamento");
  //Itera pelas  vagas

for(Map.Entry<String,Vaga>entrada:vagas.entrySet()){
//Exibe o status da vaga

  System.out.println("Vaga " + entrada.getKey() + ": " +
   entrada.getValue().isDisponivel());
}
  //Itera pelos estacionamentos pagos

for (Map.Entry<String, EstacionamentoPago> entrada :
estacionamentosPagos.entrySet()){
//Exibe o status do estacionamento

  System.out.println("Estacionamento pago "+ entrada.getKey()+ ":"+
   entrada.getValue().getPlaca());
}
}
private static String gerarCodigoPagamento(){
//Gera um código de pagamento aleatório
returnString.valueOf(Math.random());
}
}
class Vaga{
private String id;
private boolean disponivel;
public Vaga(String id,boolean disponivel){
this.id = id;
this.disponivel = disponivel;
}
public String getId(){

return id;
}
public boolean isDisponivel(){
return disponivel;
}
public void setDisponivel(boolean disponivel){
this.disponivel = disponivel;
}
}
class EstacionamentoPago{
private String placa;
private Date data;
public EstacionamentoPago(String placa,Date data){
this.placa = placa;
this.data = data;
}
public String getPlaca(){
return placa;
}
public Date getData(){
return data;
  }
 }



 