public void reverse()
{
   Node currentNode, nextNode, loopNode;
   if(first==null)
      return;

   currentNode=first;
   nextNode= first.next;
   loopNode=null;


   while(nextNode != null)
   {
        currentNode.next = loopNode;
        loopNode= currentNode;
        currentNode=nextNode;
        nextNode =nextNode.next;
   }

   first = currentNode;
   first.next = loopNode;

}